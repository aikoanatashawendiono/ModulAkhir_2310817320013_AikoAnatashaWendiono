package application;

import javafx.beans.property.SimpleStringProperty;

public class Mahasiswa {
    private SimpleStringProperty nim;
    private SimpleStringProperty nama;

    public Mahasiswa(int id, String nim, String nama) {
        this.nim = new SimpleStringProperty(nim);
        this.nama = new SimpleStringProperty(nama);
    }

    public String getNim() {
        return nim.get();
    }

    public void setNim(String nim) {
        this.nim.set(nim);
    }

    public SimpleStringProperty nimProperty() {
        return nim;
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public SimpleStringProperty namaProperty() {
        return nama;
    }
}
