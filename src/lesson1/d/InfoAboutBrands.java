package lesson1.d;

public class InfoAboutBrands {
    public void save(ModelInterface modelInterface) {
        BrandInterface bi = new NewBrand();
        bi.version(modelInterface);
    }
}
