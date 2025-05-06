public class bird extends hewan implements Flyable {

    @Override
    public void fly() {
        System.out.println("Burung terbang menggunakan sayap");
    }

    @Override
    void suara() {
        System.out.println("Icikk bossss");
    }
    
}
