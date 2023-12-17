package lesson2.factory;

public class BugattiStore implements VehicleStore{
    @Override
    public Vehicles vehicleBrand() {
        return new Bugatti();
    }
}
