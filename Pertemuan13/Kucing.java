package Pertemuan13;

public class Kucing extends Hewan {

    public Kucing() {
        super("Kucing");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}
