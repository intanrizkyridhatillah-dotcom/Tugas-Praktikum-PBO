package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // PERBEDAAN UTAMA:
        // 1. Scanner: Memiliki method parsing bawaan (nextInt, nextDouble), lebih lambat karena tokenizing.
        // 2. BufferedReader: Hanya membaca String (readLine()), harus diparse manual ke tipe data lain, jauh lebih cepat (buffer 8KB), wajib tangani IOException.

        System.out.println("=== DEMO SCANNER ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angkaScanner = scanner.nextInt();
        System.out.println("Output Scanner: " + angkaScanner);

        System.out.println("\n=== DEMO BUFFEREDREADER ===");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan sebuah angka: ");
            String input = reader.readLine();
            int angkaReader = Integer.parseInt(input); // Parse manual
            System.out.println("Output BufferedReader: " + angkaReader);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        }
    }
}
