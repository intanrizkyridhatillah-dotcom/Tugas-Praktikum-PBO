package P6;

public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";
                System.out.println("Nilai pada indeks ke-" + i + " setelah diubah: " + mobil[i]);
            }
        }
    }
}