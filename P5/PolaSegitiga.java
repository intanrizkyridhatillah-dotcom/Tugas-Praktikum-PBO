package P5;

public class PolaSegitiga {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {

            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle");
        int tinggiAtas = 3; 
        
        for (int i = 1; i <= tinggiAtas; i++) {

            for (int s = tinggiAtas; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = tinggiAtas - 1; i >= 1; i--) {

            for (int s = tinggiAtas; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}