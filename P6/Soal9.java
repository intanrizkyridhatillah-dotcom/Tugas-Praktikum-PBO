package P6;

public class Soal9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        System.out.println("\nMenggunakan enhanced for loop (for-each):");
        for (int nilai : age) {
            System.out.println("Nilai: " + nilai);
        }
    }
}