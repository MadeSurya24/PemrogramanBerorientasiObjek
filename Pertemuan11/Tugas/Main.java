package Pertemuan11.Tugas;

public class Main {
    public static void main(String[] args) {

        // Membuat objek kendaraan Mobil, Kapal, dan Pesawat
        Mobil m = new Mobil("Toyota Supra");
        Kapal k = new Kapal("Kapal Ferry");
        Pesawat p = new Pesawat("Lion Air");

        System.out.println("== Mobil =="); // Sebagai penanda batas antar informasi kendaraan 
        m.tampilkanInfo(); // Menampilkan informasi Mobil
        System.out.println("Mobil merupakan kendaraan untuk di " + m.getJenis()); //Menampilkan Jeni kendaraan

        System.out.println("== Kapal =="); // Sebagai penanda batas antar informasi kendaraan 
        k.tampilkanInfo(); // Menampilkan informasi Kapal
        System.out.println("Kapal merupakan kendaraan untuk di " + k.getJenis()); //Menampilkan Jeni kendaraan

        System.out.println("== Pesawat =="); // Sebagai penanda batas antar informasi kendaraan 
        p.tampilkanInfo(); // Menampilkan informasi Pesawat
        System.out.println("Pesawat merupakan kendaraan untuk di " + p.getJenis()); //Menampilkan Jeni kendaraan
    }
}