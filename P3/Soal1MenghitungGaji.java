package P3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Soal1MenghitungGaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Nomor Induk Karyawan (NPM): ");
        String nik = sc.nextLine();
        
        System.out.println("Masukkan Nama Karyawan: ");
        String nama = sc.nextLine();
        
        System.out.println("Masukkan Alamat: ");
        String alamat = sc.nextLine();
        
        String jabatan = "Manajer";
        double p1 = 2000000;
        double p2 = 300000;
        double p3 = 200000;
        double p4 = 150000;
        
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;
        
        System.out.println("\n------------------------------------");
        System.out.println("            SLIP GAJI               ");
        System.out.println("------------------------------------");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok (P1)      : Rp " + p1);
        System.out.println("Tunjangan Jabatan(P2): Rp " + p2);
        System.out.println("Tunjangan Istri (P3) : Rp " + p3);
        System.out.println("Tunjangan Anak (P4)  : Rp " + p4);
        System.out.println("------------------------------------");
        System.out.println("Total Gaji           : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan(10%): Rp " + pajak);
        System.out.println("Gaji Bersih          : Rp " + gajiBersih);
        System.out.println("------------------------------------");
        
        sc.close();
    }
}
