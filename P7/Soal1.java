package P7;

class MenuRoti {
    String varian;
    int jumlah;

    MenuRoti(String varian, int jumlah) {
        this.varian = varian;
        this.jumlah = jumlah;
    }

    void tampilkan() {
        System.out.println("Varian : " + varian);
        System.out.println("Jumlah : " + jumlah);
    }
}

public class Soal1 {
    public static void main(String[] args) {
        MenuRoti pesanan = new MenuRoti("Coklat Seres", 6);
        pesanan.tampilkan();
    }
}