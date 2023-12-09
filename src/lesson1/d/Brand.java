package lesson1.d;

public class Brand implements BrandInterface {
    @Override
    public void version(ModelInterface modelInterface) {
        System.out.println("Showing brands: " + modelInterface);
    }
}
