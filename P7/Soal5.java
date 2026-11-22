package P7;

class Rekursif {
    int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Rekursif r = new Rekursif();
        int angka = 5;
        System.out.println("Faktorial " + angka + " = " + r.faktorial(angka));
    }
}