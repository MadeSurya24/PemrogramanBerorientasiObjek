package Pertemuan13;

public class Main {
    public static void main(String[] args) {
        Hewan[] kebunBinatang = new Hewan[3];
        kebunBinatang[0] = new Kucing();
        kebunBinatang[1] = new Anjing();
        kebunBinatang[2] = new Burung();

        for (Hewan h : kebunBinatang) {
            h.bersuara();
        }
    }
}

