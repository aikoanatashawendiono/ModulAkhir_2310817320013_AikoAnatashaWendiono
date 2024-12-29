package controller;

import model.Pelanggan;
import model.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PelangganController {

    @FXML
    private TextField txtNama, txtEmail, txtTelepon;

    @FXML
    private TableView<Pelanggan> tablePelanggan;
    @FXML
    private TableColumn<Pelanggan, Integer> colIdPelanggan;
    @FXML
    private TableColumn<Pelanggan, String> colNama, colEmail, colTelepon;

    private ObservableList<Pelanggan> pelangganList;
    private Connection connection;

    public PelangganController() {
        pelangganList = FXCollections.observableArrayList();
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/penjualan_buku";
            String username = "root";
            String password = "";
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        colIdPelanggan.setCellValueFactory(new PropertyValueFactory<>("idPelanggan"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colTelepon.setCellValueFactory(new PropertyValueFactory<>("telepon"));
        showAllPelanggan();
    }

    public void showAllPelanggan() {
        pelangganList.clear();
        String query = "SELECT * FROM data_pelanggan";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pelanggan pelanggan = new Pelanggan(
                        rs.getInt("id pelanggan"),
                        rs.getString("nama"),
                        rs.getString("email"),
                        rs.getString("telepon")
                );
                pelangganList.add(pelanggan);
            }

            tablePelanggan.setItems(pelangganList);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPelanggan() {
        String query = "INSERT INTO data_pelanggan (nama, email, telepon) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, txtNama.getText());
            stmt.setString(2, txtEmail.getText());
            stmt.setString(3, txtTelepon.getText());

            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idPelanggan = rs.getInt(1);
                        Pelanggan pelanggan = new Pelanggan(idPelanggan, txtNama.getText(), txtEmail.getText(), txtTelepon.getText());
                        pelangganList.add(pelanggan);
                    }
                }
            }

            txtNama.clear();
            txtEmail.clear();
            txtTelepon.clear();

            showAllPelanggan();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
