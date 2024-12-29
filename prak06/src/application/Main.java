package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TabelMahasiswa.fxml"));
            primaryStage.setTitle("Tabel Mahasiswa");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ObservableList<Mahasiswa> getMahasiswaList() {
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

    public static void main(String[] args) {
        launch(args);
    }
}
