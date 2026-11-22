package P7;

// Hubungan: Pewarisan (Inheritance / is-a) -> Dosen, Mahasiswa, dan Staff adalah bagian dari Civitas Fakultas Teknik
class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
        System.out.println("-----------------------");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen Fakultas Teknik");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa Fakultas Teknik");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff Fakultas Teknik");
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Civitas d = new Dosen("Lalan Jaelani, ST.");
        Civitas m = new Mahasiswa("Intan Rizky");
        Civitas s = new Staff("Fakhira");

        d.tampilData();
        m.tampilData();
        s.tampilData();
    }
}