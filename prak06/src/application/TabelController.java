package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TabelController {

    @FXML
    private TableView<Mahasiswa> tabelMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> nimColumn;

    @FXML
    private TableColumn<Mahasiswa, String> namaColumn;

    @FXML
    public void initialize() {
        ObservableList<Mahasiswa> mahasiswaList = getMahasiswaList();
        tabelMahasiswa.setItems(mahasiswaList);
        nimColumn.setCellValueFactory(cellData -> cellData.getValue().nimProperty());
        namaColumn.setCellValueFactory(cellData -> cellData.getValue().namaProperty());
    }

    public ObservableList<Mahasiswa> getMahasiswaList() {
        ObservableList<Mahasiswa> list = FXCollections.observableArrayList();
        list.add(new Mahasiswa(1, "231913100", "Amel Putri Permana"));
        list.add(new Mahasiswa(2, "231913101", "Jovanka Castor"));
        list.add(new Mahasiswa(3, "231913102", "Xarion Quosdeluno"));
        list.add(new Mahasiswa(4, "231913103", "Gabriella Pollux"));
        list.add(new Mahasiswa(5, "231913104", "Ardintya Griggherchoi"));
        list.add(new Mahasiswa(6, "231913105", "Choi Jisuu"));
        list.add(new Mahasiswa(7, "231913106", "Rey De Varspace"));
        list.add(new Mahasiswa(8, "231913107", "Midori Tera"));
        list.add(new Mahasiswa(9, "231913108", "Ikiganari Umena"));
        list.add(new Mahasiswa(10, "231913109", "Sagari Vanyana Louanne"));
        return list;
    }
}
