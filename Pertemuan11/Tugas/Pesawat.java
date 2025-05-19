package Pertemuan11.Tugas;

// Kelas Pesawat adalah turunan dari kelas abstrak Kendaraan
// dan juga mengimplementasikan interface JenisKendaraan
public class Pesawat extends Kendaraan implements JenisKendaraan {

    // Konstruktor untuk membuat objek Pesawat
    // Parameter 'nama' akan diteruskan ke konstruktor kelas Kendaraan
    public Pesawat(String nama) {
        super(nama);
    }

    // Implementasi method abstrak dari kelas Kendaraan
    // Method ini akan menampilkan informasi tentang pesawat
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah pesawat bernama: " + nama);
    }

    // Implementasi method dari interface JenisKendaraan
    // Method ini mengembalikan jenis kendaraan, yaitu "Udara"
    @Override
    public String getJenis() {
        return "Udara";
    }
}
