package Pertemuan13;

public class Anjing extends Hewan {

    public Anjing() {
        super("Anjing");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk Guk!");
    }
}
