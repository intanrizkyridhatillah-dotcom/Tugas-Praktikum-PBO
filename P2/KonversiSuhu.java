package P2;

/**
 *
 * @author user
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        double c = 10;
        double f = 15;
        double r = 5;

        System.out.println("=== KONVERSI SUHU ===");
        
        // a. Celcius ke Fahrenheit & Sebaliknya
        double cToF = (c * 9/5) + 32;
        double fToC = (f - 32) * 5/9;
        System.out.println("a. " + c + " Celcius ke Fahrenheit = " + cToF);
        System.out.println("   " + f + " Fahrenheit ke Celcius = " + fToC);

        // b. Celcius ke Reamur & Sebaliknya
        double cToR = c * 4/5;
        double rToC = r * 5/4;
        System.out.println("b. " + c + " Celcius ke Reamur = " + cToR);
        System.out.println("   " + r + " Reamur ke Celcius = " + rToC);

        // c. Fahrenheit ke Reamur & Sebaliknya
        // Rumus F ke R: 4/9 * (F - 32)
        double fToR = 4.0/9.0 * (f - 32);
        
        // Rumus R ke F: (9/4 * R) + 32
        double rToF = (9.0/4.0 * r) + 32;
        System.out.println("c. " + f + " Fahrenheit ke Reamur = " + fToR);
        System.out.println("   " + r + " Reamur ke Fahrenheit = " + rToF);
    }
    
}
