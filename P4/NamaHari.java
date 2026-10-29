package P4;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Soal 2: Tampilkan Nama Hari ---");
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();
        
        String namaHari;
        switch (kodeHari){
        case 1: namaHari = "Senin";
        break;
        
        case 2: namaHari = "Selasa";
        break;
            
        case 3: namaHari = "Rabu";
        break;
        
        case 4: namaHari = "Kamis";
        break;
        
        case 5: namaHari = "Jumat";
        break;
        
        case 6: namaHari = "Sabtu";
        break;
        
        case 7: namaHari = "Minggu";
        break;
        
        default: namaHari = "Kode tidak valid (Harus antara 1-7)";
        break;    
        }
        System.out.println("Nama hari untuk kode " + kodeHari + " adalah: " + namaHari);
        input.close();
    }
}
