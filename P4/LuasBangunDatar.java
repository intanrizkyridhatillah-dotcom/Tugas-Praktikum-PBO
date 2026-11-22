
package P4;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Soal 7: Perhitungan Luas Bangun Datar ---");
        System.out.println("Menu:");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        double luas = 0;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.printf("Luas Persegi = %.2f\n", luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSegitiga = input.nextDouble();
                luas = 0.5 * alas * tinggiSegitiga;
                System.out.printf("Luas Segitiga = %.2f\n", luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = Math.PI * r * r;
                System.out.printf("Luas Lingkaran = %.2f\n", luas);
                break;

            case 4:
                System.out.print("Masukkan panjang sisi sejajar 1: ");
                double a = input.nextDouble();
                System.out.print("Masukkan panjang sisi sejajar 2: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = input.nextDouble();
                luas = 0.5 * (a + b) * tinggiTrapesium;
                System.out.printf("Luas Trapesium = %.2f\n", luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.printf("Luas Layang-layang = %.2f\n", luas);
                break;

            default:
                System.out.println("Pilihan menu tidak valid.");
        }

        input.close();
    }
}
