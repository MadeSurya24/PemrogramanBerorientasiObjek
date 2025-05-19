package Pertemuan11.Tugas;

// Interface adalah sebuah kontrak atau template yang menentukan method-method
public interface JenisKendaraan {

    // Method ini harus diimplementasikan oleh setiap kelas yang mengimplementasikan interface JenisKendaraan
    // Method ini akan mengembalikan jenis kendaraan, misalnya: "Darat", "Air", atau "Udara"
    public String getJenis(); // contoh: "Darat", "Air", "Udara"
}
