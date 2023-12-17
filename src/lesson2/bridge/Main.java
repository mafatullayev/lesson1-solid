package lesson2.bridge;

public class Main {
    public static void main(String[] args) {
        var auction = new Auction(new FerrariCar());
        var ferrari = auction.getCars();

        var auction2 = new Auction(new BugattiCar());
        var bugatti = auction2.getCars();

        System.out.println("Showing cars:\n");
        bugatti.showCar();
        ferrari.showCar();
    }
}
