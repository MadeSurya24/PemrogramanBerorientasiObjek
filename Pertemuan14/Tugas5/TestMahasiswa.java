package Pertemuan14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("123456", "Budi");
        Mahasiswa m2 = new Mahasiswa("123457", "Sari");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
