package praktikum2.soal1;

public class InfoBuah{
    public static void main(String[] args) {
        Buah buah1 = new Buah();
        buah1.nama = "Apel";
        buah1.beratPerBiji = 0.4;
        buah1.hargaPerBiji = 7000;
        buah1.tampilkanInfo(40);

        Buah buah2 = new Buah();
        buah2.nama = "mangga";
        buah2.beratPerBiji = 0.2;
        buah2.hargaPerBiji = 3500;
        buah2.tampilkanInfo(15);

        Buah buah3 = new Buah();
        buah3.nama = "alpukat";
        buah3.beratPerBiji = 0.25;
        buah3.hargaPerBiji = 10000;
        buah3.tampilkanInfo(12);
    }
}
