package lesson1.d;

public class NewBrand implements BrandInterface{
    @Override
    public void version(ModelInterface modelInterface) {
        System.out.println("Showing new brands: " + modelInterface);
    }
}
