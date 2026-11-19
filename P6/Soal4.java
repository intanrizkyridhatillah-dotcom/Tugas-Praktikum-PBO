package P6;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.printf("%-4s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-20s %-8d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }

        input.close();
    }
}