package P2;

/**
 *
 * @author user
 */
public class PersamaanKuadrat {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;
        //persamaan kuadrat b^2 - 4ac
        int hasil = (b * b)-(4 * a * c);
        
        System.out.println("-- Menghitung Persamaan Kuadrat (b^2 - 4ac) --");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Hasil   : " + hasil);
    }
    
}
