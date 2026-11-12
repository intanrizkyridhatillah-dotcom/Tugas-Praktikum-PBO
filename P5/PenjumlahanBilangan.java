package P5;

import java.util.Scanner;

public class PenjumlahanBilangan {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang ingin diinput: ");
        int jumlahData = input.nextInt();
        
        double total = 0;

        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double angka = input.nextDouble();
            total = total + angka;
        }

        double rataRata = total / jumlahData;

        System.out.println("\nTotal jumlah bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rataRata);
    } 
}
