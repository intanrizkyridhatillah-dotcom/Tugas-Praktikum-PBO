package P7;

import java.util.Scanner;

class DataMahasiswa {
    String nama;
    String npm;
    String kelas;

    void setData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();

        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NPM   : ");
        String npm = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();

        mhs.setData(nama, npm, kelas);
        mhs.tampilData();
        sc.close();
    }
}