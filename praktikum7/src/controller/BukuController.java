package controller;

import model.Buku;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BukuController {

    @FXML
    private TextField txtIdBuku, txtJudul, txtPenulis, txtHarga, txtStok;

    @FXML
    private TableView<Buku> tableBuku;
    @FXML
    private TableColumn<Buku, String> colIdBuku, colJudul, colPenulis;
    @FXML
    private TableColumn<Buku, Double> colHarga;
    @FXML
    private TableColumn<Buku, Integer> colStok;

    private ObservableList<Buku> bukuList;

    private Connection connection;

    public BukuController() {
        bukuList = FXCollections.observableArrayList();
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/penjualan_buku";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        colIdBuku.setCellValueFactory(new PropertyValueFactory<>("id_buku"));
        colJudul.setCellValueFactory(new PropertyValueFactory<>("judul"));
        colPenulis.setCellValueFactory(new PropertyValueFactory<>("penulis"));
        colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        colStok.setCellValueFactory(new PropertyValueFactory<>("stok"));

        showAllBuku();
    }

    public void showAllBuku() {
        bukuList.clear();
        String query = "SELECT * FROM data_penjualan_buku";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Buku buku = new Buku(
                        rs.getString("ID Buku"),
                        rs.getString("Judul"),
                        rs.getString("Penulis"),
                        rs.getDouble("Harga"),
                        rs.getInt("Stok")
                );
                bukuList.add(buku);
            }

            tableBuku.setItems(bukuList);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBuku() {
        String query = "INSERT INTO buku (id_buku, judul, penulis, harga, stok) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, txtIdBuku.getText());
            stmt.setString(2, txtJudul.getText());
            stmt.setString(3, txtPenulis.getText());
            stmt.setDouble(4, Double.parseDouble(txtHarga.getText()));
            stmt.setInt(5, Integer.parseInt(txtStok.getText()));

            stmt.executeUpdate();

            showAllBuku();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
