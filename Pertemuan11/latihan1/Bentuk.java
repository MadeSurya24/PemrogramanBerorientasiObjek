package Pertemuan11.latihan1;

// Membuat kelas abstrak bernama bentuk
// Kelas abstrak tidak bisa langsung dibuat objeknya, dan digunakan sebagai dasar (superclass) untuk kelas turunan
public abstract class Bentuk {

    // Mendeklarasikan variabel PHI sebagai konstanta untuk nilai phi(3.14)
    protected double PHI = 3.14;

    // Variabel jari-jari untuk bentuk yang memiliki lingkaran
    protected int jari2;

    // Konstruktor untuk menginisialisasi nilai jari-jari saat objek dibuat
    public Bentuk(int jari2) {
        super(); // Memanggil konstruktor superclass
        this.jari2 = jari2; // Menyimpan nilai parameter ke dalam atribut jari2
    }

    // Method abstrak untuk menghitung luas
    // Method ini tidak memiliki isi dan harus diimplementasikan di class turunan
    public abstract double luas();


    // Setter & Getter
    // Getter untuk mengambil nilai jari-jari
    public int getJari2() {
        return jari2;
    }

    // Setter untuk mengubah nilai jari jari
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
