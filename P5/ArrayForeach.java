package P5;

public class ArrayForeach {
    public static void main(String[] args) {
        int[] daftarNilai = {80, 85, 90, 95, 100};

        System.out.println("Isi data di dalam array:");
        for (int nilai : daftarNilai) {
            System.out.println(nilai);
        }
    }
}