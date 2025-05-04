package Tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        Mobil mb = new Mobil("Avanza","Toyota", 2005);
        System.out.println(mb.getNama()+" "+ mb.getMerek()+ " "+ mb.getTahun());
    }
}

