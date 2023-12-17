package lesson2.bridge;

public class Auction{
    private final Cars cars;

    public Auction(Cars cars) {
        this.cars = cars;
    }

    public Cars getCars() {
        return cars;
    }

}
