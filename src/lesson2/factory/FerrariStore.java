package lesson2.factory;

public class FerrariStore implements VehicleStore{
    @Override
    public Vehicles vehicleBrand() {
        return new Ferrari();
    }
}
