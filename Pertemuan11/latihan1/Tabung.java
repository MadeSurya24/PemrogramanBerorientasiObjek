package Pertemuan11.latihan1;

// Kelas Tabung adalah turunan dari kelas abstrak Bentuk
public class Tabung extends Bentuk{

    // Atribut tambahan khusus untuk kelas Tabung, yaitu tinggi
    private int tinggi;

    // Konstruktor default (tanpa parameter)
    // Mengatur jari-jari ke 0 dengan memanggil konstruktor superclass
    public Tabung() {
        super(0);
    }

    // Konstruktor dengan parameter jari-jari dan tinggi
    // Memanggil konstruktor superclass untuk jari-jari, dan mengatur nilai tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    // Override method luas() dari kelas Bentuk
    // Menghitung luas permukaan tabung dengan rumus : 2 * phi * r * (r + t)
    @Override
    public double luas() {
        return 2*PHI*jari2*(jari2+tinggi);
    }

    // Setter & Getter
    // Getter untuk mengambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk mengatur nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
