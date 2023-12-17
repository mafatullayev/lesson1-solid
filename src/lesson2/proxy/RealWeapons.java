package lesson2.proxy;

public class RealWeapons implements Warehouse{

    private final String gun;

    public RealWeapons(String gun) {
        this.gun = gun;
        hide();
    }

    @Override
    public void show() {
        System.out.println("Showing " + gun);
    }

    public void hide() {
        System.out.println("Hiding " + gun);
    }
}
