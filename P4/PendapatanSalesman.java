package P4;
import java.util.Scanner;

public class PendapatanSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Soal 5: Hitung Pendapatan Salesman ---");
        System.out.print("Masukkan jumlah penjualan hari ini (Rp): ");
        double penjualanHariIni = input.nextDouble();

        double uangJasa = 0;
        double komisiPersen = 0;

        if (penjualanHariIni >= 0 && penjualanHariIni <= 2000000) {
            uangJasa = 100000;
            komisiPersen = 0.10;
        } else if (penjualanHariIni > 2000000 && penjualanHariIni <= 5000000) {
            uangJasa = 200000;
            komisiPersen = 0.15;
        } else if (penjualanHariIni > 5000000) {
            uangJasa = 300000;
            komisiPersen = 0.20;
        } else {
            System.out.println("Jumlah penjualan tidak valid.");
            input.close();
            return;
        }

        double uangKomisi = komisiPersen * penjualanHariIni;
        double totalPendapatan = uangJasa + uangKomisi;

        System.out.println("\n--- Perincian Pendapatan Salesman ---");
        System.out.printf("Penjualan Hari Ini : Rp %,.0f\n", penjualanHariIni);
        System.out.printf("Uang Jasa          : Rp %,.0f\n", uangJasa);
        System.out.printf("Uang Komisi (%.0f%%) : Rp %,.0f\n", (komisiPersen * 100), uangKomisi);
        System.out.println("---------------------------------------");
        System.out.printf("Total Pendapatan   : Rp %,.0f\n", totalPendapatan);

        input.close();
    }
}
