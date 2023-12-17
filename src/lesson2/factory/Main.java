package lesson2.factory;

public class Main {
    public static void main(String[] args) {
        var vehicleStore = selectBrand();
        var vehicle = vehicleStore.vehicleBrand();
        System.out.println("Showing car a.k.a:\n");
        vehicle.showVehicle();
    }

    private static VehicleStore selectBrand() {
        return switch (Brands.BUGATTI) {
            case BUGATTI -> new BugattiStore();
            case FERRARI -> new FerrariStore();
            case LAMBORGHINI -> new LamborghiniStore();
        };
    }
}
