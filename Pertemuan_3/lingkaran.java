package Pertemuan_3;

public class lingkaran {
    double jari;
    double phi;

    public lingkaran(double jari) {
        this.jari = jari;
        this.phi = 3.14;
    }

    public double hitungLuas(){
        return phi * jari * jari;
    }
}
