package Pertemuan11.latihan1;

public class Main {

    public static void main(String[] args) {

         // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran l = new Lingkaran(10);

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung t = new Tabung(10, 5);

         // Menampilkan informasi Lingkaran
        System.out.println("== Lingkaran ==");
        System.out.println("Jari2: "+ l.jari2);
        System.out.println("luas: "+ l.luas());

        // Menampilkan informasi Tabung
        System.out.println("== Tabung ==");
        System.out.println("jari2: "+ t.jari2 +", Tinggi: "+ t.getTinggi());
        System.out.println("luas: "+ t.luas());
    }
}
