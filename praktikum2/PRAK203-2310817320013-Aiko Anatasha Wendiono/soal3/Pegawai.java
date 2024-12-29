package praktikum2.soal3;

public class Pegawai{
//public class Employee {
//karena nama class harus sesuai
    public String nama;
    
    // baris ini error karena tipe data asal seharusnya String, bukan char.
    public String asal; 
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal; 
    }

    // baris ini error karena parameter j tidak dideklarasikan.
    // public void setJabatan() { 
    public void setJabatan(String j) { 
        this.jabatan = j;
    }
}
