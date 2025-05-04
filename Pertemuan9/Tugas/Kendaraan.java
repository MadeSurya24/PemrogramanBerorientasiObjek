package Tugas;

public class Kendaraan {
    protected String merek;
    protected int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public String getMerek() {
        return merek;
    }

    public int getTahun() {
        return tahun;
    }
}

