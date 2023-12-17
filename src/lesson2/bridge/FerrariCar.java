package lesson2.bridge;

public class FerrariCar implements Cars{
    @Override
    public void showCar() {
        System.out.println("Ferrari F30 Spider");
    }
}
