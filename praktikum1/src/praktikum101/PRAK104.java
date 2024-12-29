package praktikum101;

import java.util.Scanner;

public class PRAK104 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tangan Abu: ");
        String tanganAbu = input.nextLine();
        
        System.out.print("Tangan Bagas: ");
        String tanganBagas = input.nextLine();

        int poinAbu = 0;
        int poinBagas = 0;

        String[] pilihanAbu = tanganAbu.split(" ");
        String[] pilihanBagas = tanganBagas.split(" ");

        for (int i = 0; i < 3; i++) {
            String abu = pilihanAbu[i];
            String bagas = pilihanBagas[i];

            if (abu.equals(bagas)) {
            	
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                       (abu.equals("G") && bagas.equals("K")) ||
                       (abu.equals("K") && bagas.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Pemenang: Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Pemenang: Bagas");
        } else {
            System.out.println("Hasil: Seri");
        }

        input.close();
    }
}
