package Pertemuan11.Tugas;

// Kelas Kapal adalah turunan dari kelas abstrak Kendaraan
// dan juga mengimplementasikan interface JenisKendaraan
public class Kapal extends Kendaraan implements JenisKendaraan {

    // Konstruktor untuk membuat objek Kapal
    // Parameter 'nama' akan diteruskan konstruktor kelas Kendaraan
    public Kapal(String nama) {
        super(nama); // Memanggil konstruktor dari kelas Kendaraan untuk mengisi atribut 'nama'
    }

    // Implementasi method abstrak dari kelas Kendaraan
    // Method ini akan menampilkan informasi tentang kapal
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah kapal bernama: " + nama);
    }

    // Implementasi method dari interface JenisKendaraan
    // Method ini akan mengembalikan jenis kendaraan, dalam hal ini "Air"
    @Override
    public String getJenis() {
        return "Air";
    }
}

