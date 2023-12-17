package lesson2.prototype;


public class PaymentMethod implements MethodControl{
    private String name;
    private String cardType;
    private Long id;

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "name = '" + name + '\'' +
                ", cardType = '" + cardType + '\'' +
                ", date = " + id +
                '}';
    }

    public PaymentMethod(String name, String cardType, Long id) {
        this.name = name;
        this.cardType = cardType;
        this.id = id;
    }

    @Override
    public Object clone() {
        return new PaymentMethod(name, cardType, id);
    }
}
