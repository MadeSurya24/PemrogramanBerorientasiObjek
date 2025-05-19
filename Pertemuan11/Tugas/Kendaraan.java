package Pertemuan11.Tugas;

// Kelas abstrak Kendaraan. Kelas abstrak tidak bisa langsung dibuat objeknya.
// Digunakan sebagai dasar (superclass) bagi kelas-kelas turunannya.
public abstract class Kendaraan {

    // Variabel 'nama' bersifat protected, artinya bisa diakses oleh kelas ini 
    // dan juga oleh kelas-kelas turunannya
    protected String nama;


    // Konstruktor: method khusus yang dipanggil saat objek dibuat
    // Digunakan untuk menginisialisasi nilai 'nama'
    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang harus diimplementasikan oleh semua kelas turunan
    // Setiap jenis kendaraan harus memiliki cara sendiri untuk menampilkan info
    public abstract void tampilkanInfo();

    // Method getter untuk mengambil nilai 'nama'
    public String getNama() {
        return nama;
    }
}

