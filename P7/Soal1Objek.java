package P7;

class KuePreOrder {
    String namaProduk;
    int jumlah;

    KuePreOrder(String namaProduk, int jumlah) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
    }

    void tampilkan() {
        System.out.println("Produk : " + namaProduk);
        System.out.println("Jumlah : " + jumlah);
    }
}

public class Soal1Objek {
    public static void main(String[] args) {
        KuePreOrder pesanan = new KuePreOrder("Donat Coklat Seres", 6);
        pesanan.tampilkan();
    }
}