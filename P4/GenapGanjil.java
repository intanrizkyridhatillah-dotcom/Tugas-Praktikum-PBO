package P4;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Soal 1: Bilangan Genap/Ganjil ---");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Menggunakan operator modulus (%) untuk menentukan sisa pembagian
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil.");
        }
        
        input.close();
    }
}
