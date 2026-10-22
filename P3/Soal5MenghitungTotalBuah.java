package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Soal5MenghitungTotalBuah{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("=== MENGHITUNG TOTAL BUAH IBU SISCA ===");
            
            // Sesuai data soal: mangga 70, tetangga 4, jambu per tetangga 30, mangga busuk 15
            System.out.print("Masukkan jumlah mangga awal yang dibeli (pcs): ");
            int manggaBeli = Integer.parseInt(reader.readLine()); // 70

            System.out.print("Masukkan jumlah tetangga yang diberi jambu : ");
            int jumlahTetangga = Integer.parseInt(reader.readLine()); // 4

            System.out.print("Masukkan jumlah jambu per tetangga (pcs)  : ");
            int jambuPerTetangga = Integer.parseInt(reader.readLine()); // 30

            System.out.print("Masukkan jumlah mangga yang busuk (pcs)   : ");
            int manggaBusuk = Integer.parseInt(reader.readLine()); // 15

            int totalJambu = jumlahTetangga * jambuPerTetangga;
            int manggaBagus = manggaBeli - manggaBusuk;
            int totalBuahDibeli = manggaBagus + totalJambu;

            System.out.println("\n--- RINCIAN AKHIR ---");
            System.out.println("Mangga Bagus (Setelah dikurangi busuk): " + manggaBagus + " pcs");
            System.out.println("Total Buah Jambu untuk Tetangga       : " + totalJambu + " pcs");
            System.out.println("Total Keseluruhan Buah yang Dibeli    : " + totalBuahDibeli + " pcs");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Mohon masukkan angka yang valid!");
        }
    }
}
