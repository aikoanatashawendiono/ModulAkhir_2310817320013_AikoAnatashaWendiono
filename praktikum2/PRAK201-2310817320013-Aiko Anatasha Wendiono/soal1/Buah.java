package praktikum2.soal1;

public class Buah {
    String nama;
    double beratPerBiji;
    double hargaPerBiji;

    public void tampilkanInfo(double jumlahBerat) {
        double hargaSebelumDiskon = (jumlahBerat / beratPerBiji) * hargaPerBiji;
        int jumlahKelipatanDiskon = (int) (jumlahBerat / 4);
        double diskon = jumlahKelipatanDiskon * (0.02 * 4 * hargaPerBiji);
        double hargaSetelahDiskon = hargaSebelumDiskon - diskon;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat per Biji: " + beratPerBiji + "kg");
        System.out.println("Harga: " + hargaPerBiji);
        System.out.println("Jumlah Beli: " + jumlahBerat + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hargaSetelahDiskon);
        System.out.println();
    }
}
