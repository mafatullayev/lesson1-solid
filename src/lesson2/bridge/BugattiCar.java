package lesson2.bridge;

public class BugattiCar implements Cars{
    @Override
    public void showCar() {
        System.out.println("Bugatti Veyron");
    }
}
