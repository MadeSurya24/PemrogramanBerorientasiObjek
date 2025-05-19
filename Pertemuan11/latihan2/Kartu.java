package Pertemuan11.latihan2;

// Interface Kartu berfungsi sebagai kontrak untuk kelas-kelas yang ingin mewakili jenis kartu
public interface Kartu {

    // Method otentikasi digunakan untuk mengecek apakah PIN yang dimasukkan benar
    // Parameter: pin (string yang dimasukkan user)
    // Return: true jika otentikasi berhasil, false jika gagal
    public boolean otentikasi(String pin);

    // Method encode digunakan untuk mengenkripsi atau mengubah format PIN
    // Parameter: pin asli
    // Return: PIN dalam format terenkripsi atau versi lain
    public String encode(String pin);
}
