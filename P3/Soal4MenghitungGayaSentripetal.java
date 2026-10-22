package P3;

import java.util.Scanner;

public class Soal4MenghitungGayaSentripetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENGHITUNG GAYA SENTRIPETAL ===");
        System.out.print("Masukkan Massa benda (m) dalam kg : ");
        double m = scanner.nextDouble();

        System.out.print("Masukkan Kecepatan (v) dalam m/s : ");
        double v = scanner.nextDouble();

        System.out.print("Masukkan Jari-jari (r) dalam meter : ");
        double r = scanner.nextDouble();

        if (r <= 0) {
            System.out.println("Error: Jari-jari (r) tidak boleh nol!");
        } else {
            double fc = (m * Math.pow(v, 2)) / r;
            System.out.println("Hasil Gaya Sentripetal (Fc) = " + fc + " Newton");
        }

        scanner.close();
    }
}
