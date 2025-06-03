package Pertemuan13;

public abstract class Hewan implements Bersuara {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();
}