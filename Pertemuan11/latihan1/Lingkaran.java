package Pertemuan11.latihan1;

// Kelas lingkaran merupakan kelas turunan (subclass) dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk{

    // Konstruktor Lingkaran akan memanggil konstruktor superclass (Bentuk)
    // dan mengisi nilai jari-jari
    public Lingkaran(int jari2) {
        super(jari2); // Memanggil konstruktor di kelas Bentuk
    }

    // Override method luas() dari kelas Bentuk
    // Menghitung luas lingkaran dengan rumus : phi * r^2
    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
