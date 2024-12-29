package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> bulanMap = new HashMap<>();
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        for (int i = 0; i < namaBulan.length; i++) {
            bulanMap.put(i + 1, namaBulan[i]);
        }

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();
 
        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Nama negara: ");
            String nama = scanner.nextLine();

            System.out.print("Jenis kepemimpinan: ");
            String jenisKepemimpinan = scanner.nextLine();

            System.out.print("Nama pemimpin: ");
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {

                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
            	
                System.out.print("Tanggal kemerdekaan: ");
                int tanggalKemerdekaan = scanner.nextInt();

                System.out.print("Bulan kemerdekaan: ");
                int bulanKemerdekaan = scanner.nextInt();

                System.out.print("Tahun kemerdekaan: ");
                int tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine(); 

                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, 
                                            tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
            }
        }

        System.out.println();
        for (Negara negara : daftarNegara) {
            System.out.print(negara.toString(bulanMap));
        }

        scanner.close();
    }
}
