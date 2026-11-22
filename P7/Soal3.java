package P7;

import java.util.Scanner;

class TebakLahir {
    // Rumus: (((bulan * 20) + 3) * 5) + tanggal - 15 -> menghasilkan (100 * bulan) + tanggal
    int hitungHasil(int bulan, int tanggal) {
        return (((bulan * 20) + 3) * 5) + tanggal - 15;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TebakLahir tl = new TebakLahir();

        System.out.print("Masukkan bulan lahir (1-12)  : ");
        int bulan = sc.nextInt();
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = sc.nextInt();

        System.out.println("Hasil akhir = " + tl.hitungHasil(bulan, tanggal));
        sc.close();
    }
}