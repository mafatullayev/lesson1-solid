package lesson1.i;

public class First implements Fourth, Third {
    @Override
    public int data1() {
        return 10;
    }

    @Override
    public int data2() {
        return 30;
    }

    @Override
    public int data3() {
        return 20;
    }
}
