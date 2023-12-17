package lesson2.adapter;

public class Main {
    public static void main(String[] args) {
        var androidCharge = new AndroidCharge();
        androidCharge.androidCharger();

        var iosCharge = new IPhoneCharge();
        iosCharge.iosCharger();
    }
}
