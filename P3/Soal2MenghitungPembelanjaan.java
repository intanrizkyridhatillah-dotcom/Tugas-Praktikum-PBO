package P3;

import java.io.*;
import java.util.Scanner;

public class Soal2MenghitungPembelanjaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "pembelanjaan.dat";

        // Menerima input interaktif dari pengguna (Keyboard)
        System.out.println("=== APLIKASI PEMBELANJAAN ===");
        System.out.print("Masukkan Nama          : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Total Belanja : ");
        double totalBelanja = scanner.nextDouble();

        System.out.print("Masukkan Diskon (%)    : ");
        double diskonPersen = scanner.nextDouble();

        System.out.print("Masukkan Uang Bayar    : ");
        double bayar = scanner.nextDouble();

        // 1. Menulis data yang di-input tadi ke file menggunakan DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskonPersen);
            dos.writeDouble(bayar);
            System.out.println("\n[Info] Data berhasil disimpan ke file biner.");
        } catch (IOException e) {
            System.out.println("Error penulisan: " + e.getMessage());
        }

        // 2. Membaca kembali data dari file menggunakan DataInputStream & menghitung hasilnya
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            String rNama = dis.readUTF();
            double rTotalBelanja = dis.readDouble();
            double rDiskonPersen = dis.readDouble();
            double rBayar = dis.readDouble();

            double diskonRupiah = (rDiskonPersen / 100) * rTotalBelanja;
            double total = rTotalBelanja - diskonRupiah;
            double kembalian = rBayar - total;

            System.out.println("\n--- STRUK PEMBELANJAAN ---");
            System.out.println("Nama         : " + rNama);
            System.out.println("Total Belanja: Rp " + rTotalBelanja);
            System.out.println("Diskon (%)   : " + rDiskonPersen + "%");
            System.out.println("Total        : Rp " + total);
            System.out.println("Bayar        : Rp " + rBayar);
            System.out.println("Kembalian    : Rp " + kembalian);
            System.out.println("--------------------------");
        } catch (IOException e) {
            System.out.println("Error pembacaan: " + e.getMessage());
        }

        scanner.close();
    }
}