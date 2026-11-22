package P2;

/**
 *
 * @author user
 */
public class PythagorasSegitiga {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;

        // Mencari nilai c menggunakan rumus Pythagoras: c = akar(a^2 + b^2)
        double c = Math.sqrt((a * a) + (b * b));

        // Menghitung keliling segitiga: a + b + c
        double keliling = a + b + c;

        System.out.println("=== Menghitung Sisi C dan Keliling Segitiga ===");
        System.out.println("Sisi a     : " + a);
        System.out.println("Sisi b     : " + b);
        System.out.println("Sisi c     : " + c);
        System.out.println("Keliling   : " + keliling);
    }
}
