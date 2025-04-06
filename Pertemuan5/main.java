public class main {
    
    public static void main(String[] args) {
        
        Gelas gelas1 = new Gelas("Hitam");

        Gelas gelas2 = new Gelas("Biru");
    }

    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
        Gelas tmp = new Gelas(g1.getWarna());
    }
}
