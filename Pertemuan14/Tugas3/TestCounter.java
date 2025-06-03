package Pertemuan14.Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Jumlah objek Counter yang dibuat: " + Counter.getInstanceCount());
    }
}
