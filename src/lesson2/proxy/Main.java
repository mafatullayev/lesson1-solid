package lesson2.proxy;

public class Main {
    public static void main(String[] args) {
        var weapon = new ProxyWeapons("AK-47");
        weapon.show();
    }
}
