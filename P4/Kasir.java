package P4;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Soal 6: Program Kasir Sederhana ---");
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char memberInput = input.next().toLowerCase().charAt(0);
        boolean punyaMember = (memberInput == 'y');

        System.out.print("Masukkan Total Belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        // Logika if-else sesuai ketentuan soal
        if (punyaMember) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalHarusDibayar = totalBelanja - diskon;

        System.out.println("-----------------------------------");
        System.out.printf("Total Belanja Awal : Rp %,.0f\n", totalBelanja);
        System.out.printf("Diskon             : Rp %,.0f\n", diskon);
        System.out.printf("Total Harus Dibayar: Rp %,.0f\n", totalHarusDibayar);
        System.out.println("-----------------------------------");

        System.out.print("Masukkan Uang yang Diberikan (Rp): ");
        double uangDiberikan = input.nextDouble();

        double kembalian = uangDiberikan - totalHarusDibayar;
        System.out.printf("Uang Kembalian     : Rp %,.0f\n", kembalian);
        System.out.println("-----------------------------------");

        input.close();
    }
}
