package Pertemuan13;

public class Burung extends Hewan {

    public Burung() {
        super("Burung");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit Cuit!");
    }
}

