package P3;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== APLIKASI PERCETAKAN NOVEL ===");
        System.out.print("Masukkan banyaknya novel yang akan dicetak : ");
        int jumlahNovel = scanner.nextInt();

        System.out.print("Masukkan tebal lembar per novel            : ");
        int tebalPerNovel = scanner.nextInt();

        long totalLembar = (long) jumlahNovel * tebalPerNovel;
        long totalDetik = totalLembar; // Karena kecepatan 1 lembar/detik[cite: 2]

        long hari = totalDetik / 86400; // 1 hari = 86400 detik[cite: 2]
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;     // 1 jam = 3600 detik[cite: 2]
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;      // 1 menit = 60 detik[cite: 2]
        long detik = sisaJam % 60;

        System.out.println("\n--- HASIL WAKTU PERCETAKAN ---");
        System.out.println("Total Lembar : " + totalLembar + " lembar");
        System.out.println("Waktu Cetak  : " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");

        scanner.close();
    }
}