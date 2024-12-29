package praktikum101;

import java.util.Scanner;

public class PRAK101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();
        
        String namaBulan = "";
        if (bulanLahir == 1) {
            namaBulan = "Januari";
        } else if (bulanLahir == 2) {
            namaBulan = "Februari";
        } else if (bulanLahir == 3) {
            namaBulan = "Maret";
        } else if (bulanLahir == 4) {
            namaBulan = "April";
        } else if (bulanLahir == 5) {
            namaBulan = "Mei";
        } else if (bulanLahir == 6) {
            namaBulan = "Juni";
        } else if (bulanLahir == 7) {
            namaBulan = "Juli";
        } else if (bulanLahir == 8) {
            namaBulan = "Agustus";
        } else if (bulanLahir == 9) {
            namaBulan = "September";
        } else if (bulanLahir == 10) {
            namaBulan = "Oktober";
        } else if (bulanLahir == 11) {
            namaBulan = "November";
        } else if (bulanLahir == 12) {
            namaBulan = "Desember";
        }
        
        System.out.println();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir +
                           " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        
        input.close();
    }
}
