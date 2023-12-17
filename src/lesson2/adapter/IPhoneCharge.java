package lesson2.adapter;

public class IPhoneCharge implements IPhone{
    public AndroidCharge androidCharge;

    public IPhoneCharge() {
    }

    @Override
    public void iosCharger() {
        System.out.println("Charging via ios port");
    }
}
