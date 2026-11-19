package P6;

class PekerjaThread extends Thread {
    public PekerjaThread(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        System.out.println("Menjalankan " + getName() + " (ID: " + threadId() + ")");
    }
}

public class Soal8 {
    public static void main(String[] args) {
        int jumlahThread = 5;

        for (int i = 1; i <= jumlahThread; i++) {
            PekerjaThread t = new PekerjaThread("Thread-Anak-" + i);
            t.start();
        }
    }
}