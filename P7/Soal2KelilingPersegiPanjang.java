package P7;

import java.util.Scanner;

class PersegiPanjang {
    double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
}

public class Soal2KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang pp = new PersegiPanjang();

        System.out.print("Masukkan panjang : ");
        double p = sc.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double l = sc.nextDouble();

        System.out.println("Keliling = " + pp.hitungKeliling(p, l));
        sc.close();
    }
}