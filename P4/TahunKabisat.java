package P4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Soal 4: Tentukan Tahun Kabisat ---");
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        // Aturan tahun kabisat: Habis dibagi 400, atau habis dibagi 4 tapi tidak habis dibagi 100
        if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " adalah BUKAN Tahun Kabisat.");
        }

        input.close();
    }
}
