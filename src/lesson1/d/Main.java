package lesson1.d;

public class Main {
    public static void main(String[] args) {
        InfoAboutBrands info = new InfoAboutBrands();
        info.save(new Vehicle());
        info.save(new Engine(6, 560));
        info.save(new Version());
    }
}
