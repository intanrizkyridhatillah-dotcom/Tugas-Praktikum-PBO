package P3;

import java.util.Scanner;

public class Soal6MenghitungSelisihWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- WAKTU PERTAMA ---");
        System.out.print("Jam   : ");
        int jam1 = scanner.nextInt();
        System.out.print("Menit : ");
        int menit1 = scanner.nextInt();
        System.out.print("Detik : ");
        int detik1 = scanner.nextInt();

        System.out.println("\n--- WAKTU KEDUA ---");
        System.out.print("Jam   : ");
        int jam2 = scanner.nextInt();
        System.out.print("Menit : ");
        int menit2 = scanner.nextInt();
        System.out.print("Detik : ");
        int detik2 = scanner.nextInt();

        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int hasilJam = selisihDetik / 3600;
        int sisa = selisihDetik % 3600;
        int hasilMenit = sisa / 60;
        int hasilDetik = sisa % 60;

        System.out.println("\n--- SELISIH WAKTU ---");
        System.out.println(hasilJam + " Jam, " + hasilMenit + " Menit, " + hasilDetik + " Detik");

        scanner.close();
    }
}
