package P6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Masukkan jumlah elemen array satu dimensi
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // b. Memasukkan nilai elemen sesuai dengan jumlah elemennya
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }

        // c. Tampilkan nilai terbesar dan terkecil dari elemen yang telah diinputkan serta posisi indeksnya
        int max = arr[0];
        int min = arr[0];
        int idxMax = 0;
        int idxMin = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("\nNilai terbesar: " + max + " pada indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks ke-" + idxMin);

        // d. Jumlahkan semua data array tersebut dan cari nilai rata-ratanya
        int jumlahTotal = 0;
        for (int nilai : arr) {
            jumlahTotal += nilai;
        }
        double rataRata = (double) jumlahTotal / n;
        System.out.println("\nJumlah semua elemen: " + jumlahTotal);
        System.out.println("Rata-rata elemen: " + rataRata);

        // e. Jumlahkan semua elemen yang berindeks ganjil (NPM genap)
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }
        System.out.println("\nJumlah elemen berindeks ganjil: " + jumlahIndeksGanjil);

        // f. Jumlahkan semua elemen yang berindeks genap (NPM ganjil)
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }
        System.out.println("Jumlah elemen berindeks genap: " + jumlahIndeksGenap);

        // g. Check hasil penjumlahan dari langkah e atau f, apakah bernilai ganjil atau genap. Tampilkan hasilnya
        String statusGanjilGenap = (jumlahIndeksGenap % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("\nHasil penjumlahan langkah f (" + jumlahIndeksGenap + ") bernilai: " + statusGanjilGenap);

        // h. Urutkan elemen array yang telah dibuat
        Arrays.sort(arr);
        System.out.println("\nArray setelah diurutkan: " + Arrays.toString(arr));

        input.close();
    }
}