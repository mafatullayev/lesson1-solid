package lesson2.proxy;

public class ProxyWeapons implements Warehouse{

    private final String gun;
    private RealWeapons realWeapons;

    public ProxyWeapons(String gun) {
        this.gun = gun;
    }

    @Override
    public void show() {
        if (realWeapons == null)
            realWeapons = new RealWeapons(gun);
        realWeapons.show();
    }
}
