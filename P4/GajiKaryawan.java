package P4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Soal 3: Hitung Gaji Karyawan ---");
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();
        
        System.out.print("Apakah sudah menikah? (y/n): ");
        char statusMenikahInput = input.next().toLowerCase().charAt(0);
        
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        boolean statusMenikah = (statusMenikahInput == 'y');
        long gajiPokok = 0;
        String keteranganGolongan = "";

        switch (kodeGolongan) {
            case 1:
                keteranganGolongan = "Menikah";
                gajiPokok = 1200000;
                break;
            case 2:
                keteranganGolongan = "Belum menikah";
                gajiPokok = 1500000;
                break;
            case 3:
                keteranganGolongan = "Cerai";
                gajiPokok = 1750000;
                break;
            case 4:
                keteranganGolongan = "Menikah dan punya anak";
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode Golongan tidak valid.");
                input.close();
                return;
        }

        // d) Tunjangan anak: 5% dari gaji pokok dikali jumlah anak
        double tunjanganAnak = 0;
        if (jumlahAnak > 0) {
            tunjanganAnak = (0.05 * gajiPokok) * jumlahAnak;
        }

        // c) Tunjangan pasangan: 10% dari gaji pokok
        double tunjanganPasangan = 0;
        if (statusMenikah) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        // b) Tunjangan = tunjangan pasangan + tunjangan anak
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;

        // a) Gaji bersih = gaji pokok + tunjangan
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n--- Slip Gaji Karyawan ---");
        System.out.println("NIK               : " + nik);
        System.out.println("Nama              : " + nama);
        System.out.println("Golongan          : " + kodeGolongan + " (" + keteranganGolongan + ")");
        System.out.printf("Gaji Pokok        : Rp %,d\n", gajiPokok);
        System.out.printf("Tunjangan Pasangan: Rp %,.0f\n", tunjanganPasangan);
        System.out.printf("Tunjangan Anak    : Rp %,.0f\n", tunjanganAnak);
        System.out.printf("Total Tunjangan   : Rp %,.0f\n", totalTunjangan);
        System.out.println("-----------------------------------");
        System.out.printf("Gaji Bersih       : Rp %,.0f\n", gajiBersih);

        input.close();
    }
}
