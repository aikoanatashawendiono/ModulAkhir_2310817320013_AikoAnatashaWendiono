package praktikum2.soal3; 
 
public class Soal3Main { 
    public static void main(String[] args) { 
        Pegawai p1 = new Pegawai(); 
        // baris ini error karena tidak ada titik koma (;) di akhir pernyataan.
        // p1.nama = "Roi" 
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
 
        //System.out.println("Nama Pegawai: " + p1.getNama()); 
        //nama output tidak sesuai, seharusnya "Nama", bukan "Nama Pegawai"
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        // baris ini error karena tidak ada informasi umur yang ditetapkan. 
        // jadi, harus menambahkan umur p1 sebelum mencetaknya.
        // System.out.println("Umur: " + p1.umur); 
        p1.umur = 17; // perbaikan: menambahkan nilai umur p1.
        System.out.println("Umur: " + p1.umur + " tahun");
        } 
    }