package praktikum101;

import java.util.Scanner;

public class PRAK103 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        int n = input.nextInt();
        System.out.print("Output: ");
        int angkaAwal = input.nextInt();

        int count = 0;
        
        do {
            if (angkaAwal % 2 != 0) {
                System.out.print(angkaAwal + " ");
                count++;
            }
            angkaAwal++;
        } while (count < n); 

        input.close();
    }
}
