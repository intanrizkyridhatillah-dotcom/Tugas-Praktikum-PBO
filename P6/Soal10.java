package P6;

public class Soal10 {
    public static void main(String[] args) {
        Object[] dataCampuran = {19, 0.2, 'C', "Java", true};

        for (Object item : dataCampuran) {
            System.out.println(item + " (Tipe: " + item.getClass().getSimpleName() + ")");
        }
    }
}