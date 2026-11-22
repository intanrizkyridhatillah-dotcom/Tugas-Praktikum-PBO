package P6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Jumlah bilangan harus lebih dari 0.");
            }

            double[] angka = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
                total += angka[i];
            }

            double rataRata = total / n;
            System.out.println("Rata-rata: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka/bilangan valid!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}