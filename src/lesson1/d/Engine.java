package lesson1.d;

public class Engine implements ModelInterface{
    int motor;
    int horsePower;

    @Override
    public String toString() {
        return "Engine{" +
                "motor=" + motor +
                ", horsePower=" + horsePower +
                '}';
    }

    public Engine(int motor, int horsePower) {
        this.motor = motor;
        this.horsePower = horsePower;
    }
}
