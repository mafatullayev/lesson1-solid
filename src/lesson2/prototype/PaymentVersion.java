package lesson2.prototype;

public class PaymentVersion {
    private final PaymentMethod paymentMethod;

    public PaymentVersion(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod copyOfPayment() {
        return (PaymentMethod) paymentMethod.clone();
    }
}
