package P2;

/**
 *
 * @author user
 */
public class WaktuCahaya {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000.0; // km/s
        double jarakBulan = 384400.0; // km
        double jarakMatahari = 152100000.0; // km (152.1 juta km)

        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("-- Waktu Tempuh Cahaya --");
        System.out.println("Waktu tempuh ke Bulan   : " + waktuBulan + " detik");
        System.out.println("Waktu tempuh ke Matahari: " + waktuMatahari + " detik (" + (waktuMatahari / 60) + " menit)");
    }
    
}
