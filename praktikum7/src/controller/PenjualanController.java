package controller;

import model.Penjualan;
import model.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PenjualanController {

    @FXML
    private TextField txtPelangganId, txtBukuId, txtJumlah, txtTotalHarga;

    @FXML
    private TableView<Penjualan> tablePenjualan;
    @FXML
    private TableColumn<Penjualan, Integer> colPelangganId, colBukuId, colJumlah;
    @FXML
    private TableColumn<Penjualan, Double> colTotalHarga;

    private ObservableList<Penjualan> penjualanList;

    public PenjualanController() {
        penjualanList = FXCollections.observableArrayList();
    }

    public void showAllPenjualan() {
        String sql = "SELECT * FROM penjualan_buku";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            penjualanList.clear();
            while (rs.next()) {
                int penjualanId = rs.getInt("id_penjualan");
                int pelangganId = rs.getInt("id_pelanggan");
                int bukuId = rs.getInt("id_buku");
                int jumlah = rs.getInt("jumlah");
                double totalHarga = rs.getDouble("total_harga");
                penjualanList.add(new Penjualan(penjualanId, pelangganId, bukuId, jumlah, totalHarga, rs.getDate("tanggal")));
            }
            tablePenjualan.setItems(penjualanList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPenjualan() {
        String sql = "INSERT INTO data_penjualan_saja (id_penjualan, id_pelanggan, id_buku, jumlah, total_harga) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Integer.parseInt(txtPelangganId.getText()));
            stmt.setInt(2, Integer.parseInt(txtBukuId.getText()));
            stmt.setInt(3, Integer.parseInt(txtJumlah.getText()));
            stmt.setDouble(4, Double.parseDouble(txtTotalHarga.getText()));
            stmt.executeUpdate();
            showAllPenjualan();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
