package P7;

class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
        System.out.println("----------------------");
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

public class Soal6CivitasFT {
    public static void main(String[] args) {
        Civitas d = new Dosen("Lalan Jaelani, ST.");
        Civitas m = new Mahasiswa("Intan");
        Civitas s = new Staff("Fakhira");

        d.tampilInfo();
        m.tampilInfo();
        s.tampilInfo();
    }
}