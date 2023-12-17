package lesson2.abstarct_factory;

public class Main {
    public static void main(String[] args) {
        var factory = new CarsFactory();
        var bugatti = factory.showBugatti();
        var ferrari = factory.showFerrari();
        var lamborghini = factory.showLamborghini();

        System.out.println("Showing car models:\n");
        bugatti.getBugatti();
        lamborghini.getLamborghini();
        ferrari.getFerrari();
    }
}
