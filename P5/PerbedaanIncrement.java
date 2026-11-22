package P5;

public class PerbedaanIncrement {
    public static void main(String[] args) {
        System.out.println("Hasil menggunakan i++ (post-increment):");
        int i = 1;
        while (i <= 3) {

            System.out.println(i++); 
        }

        System.out.println("\nHasil menggunakan ++i (pre-increment):");
        int j = 1;
        while (j <= 3) {

            System.out.println(++j); 
        }
    }
}