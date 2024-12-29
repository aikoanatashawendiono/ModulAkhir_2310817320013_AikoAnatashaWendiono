package soal1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int totalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan: " + totalNilai);
        scanner.close();
    }
}
