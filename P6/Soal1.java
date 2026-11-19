package P6;

import java.util.Arrays;

public class Soal1 {
    public static void main(String[] args) {
        int[] angka1 = {10, 20, 30, 40, 50};

        int[] angka2 = new int[5];
        angka2[0] = 10;
        angka2[1] = 20;
        angka2[2] = 30;
        angka2[3] = 40;
        angka2[4] = 50;

        int[] angka3;
        angka3 = new int[]{10, 20, 30};

        System.out.println("angka1: " + Arrays.toString(angka1));
        System.out.println("angka2: " + Arrays.toString(angka2));
        System.out.println("angka3: " + Arrays.toString(angka3));
    }
}