package Pertemuan11.Tugas;

// Kelas Mobil merupakan turunan (subclass) dari kelas abstrak Kendaraan
// dan juga mengimplementasikan interface JenisKendaraan
public class Mobil extends Kendaraan implements JenisKendaraan {

    // Konstruktor untuk kelas Mobil
    // Memanggil konstruktor dari superclass (Kendaraan) menggunakan keyword 'super'
    public Mobil(String nama) {
        super(nama); // Mengatur nilai atribut 'nama' yang diwarisi dari Kendaraan
    }

    // Implementasi method abstrak dari kelas Kendaraan
    // Menampilkan informasi tentang mobil
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah mobil bernama: " + nama);
    }

    // Implementasi method dari interface JenisKendaraan
    // Mengembalikan jenis kendaraan, dalam hal ini "Darat"
    @Override
    public String getJenis() {
        return "Darat";
    }
}
