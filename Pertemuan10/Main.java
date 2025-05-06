public class Main {
    public static void main(String[] args) {
        kucing k = new kucing();
        k.suara();
        k.makan();
        
        System.out.println();

        bird b = new bird();
        b.fly();
        b.suara();
        b.makan();

        pesawat p = new pesawat();
        p.fly();
    }
}
