package praktikum101;

import java.util.Scanner;

public class PRAK102 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        int angka = input.nextInt();
        
        int count = 0;  
        int[] hasil = new int[11];
        
        while (count < 11) {
            if (angka % 5 == 0) {
                hasil[count] = (angka / 5) - 1;
            } else {
                hasil[count] = angka;
            }
            
            angka++;
            count++;
        }
        
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
        
        input.close();
    }
}
