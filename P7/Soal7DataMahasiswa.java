package P7;

import java.util.Scanner;

class MahasiswaInput {
    String nama;
    String npm;
    String kelas;

    void inputData(String nama, String npm, String kelas) {
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

public class Soal7DataMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaInput mhs = new MahasiswaInput();

        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NPM   : ");
        String npm = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();

        mhs.inputData(nama, npm, kelas);
        mhs.tampilData();
        sc.close();
    }
}