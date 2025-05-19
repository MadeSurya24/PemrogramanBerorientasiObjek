package Pertemuan11.latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    private String KodeBank; // Menyimpan kode bank, contoh: "BCA", "BRI", dll
    private String pin; // Menyimpan PIN asli

    // Konstruktor: mengatur kode bank dan PIN saat objek dibuat
    public KartuElektronik(String KodeBank, String pin) {
        super(); // Memanggil constructor dari class Object (tidak wajib sebenarnya)
        this.KodeBank = KodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface
    @Override
    public boolean otentikasi(String pinInput) {
        // Mengecek apakah PIN input sama dengan PIN yang tersimpan
        if(pin.equals(pinInput))
            return true;
        else
            return false;
    }

    // Implementasi method encode dari interface
    @Override
    public String encode(String pin) {
        // melakukan enkripsi inputan pin
        // Belum diimplementasikan (masih return null)
        return null;
    }
}
