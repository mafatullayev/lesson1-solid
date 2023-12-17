package lesson2.factory;

public class LamborghiniStore implements VehicleStore{
    @Override
    public Vehicles vehicleBrand() {
        return new Lamborghini();
    }
}
