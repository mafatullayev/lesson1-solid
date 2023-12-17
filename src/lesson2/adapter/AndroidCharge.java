package lesson2.adapter;

public class AndroidCharge implements Android{
    public IPhoneCharge iphoneCharge;

    public AndroidCharge() {
    }


    @Override
    public void androidCharger() {
        System.out.println("Charging via android port");
    }
}
