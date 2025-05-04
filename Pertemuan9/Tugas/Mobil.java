package Tugas;

public class Mobil extends Kendaraan {

    private String nama;

    public Mobil(String nama, String merek, int tahun) {
        super(merek, tahun);
        setNama(nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

