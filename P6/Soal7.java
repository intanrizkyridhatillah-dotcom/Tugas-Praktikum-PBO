package P6;

class ThreadBaru extends Thread {
    private String namaThread;

    public ThreadBaru(String namaThread) {
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(namaThread + " sedang berjalan - iterasi ke-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(namaThread + " terganggu.");
            }
        }
    }
}

public class Soal7 {
    public static void main(String[] args) {
        ThreadBaru t1 = new ThreadBaru("Worker-Thread-1");
        t1.start();
    }
}