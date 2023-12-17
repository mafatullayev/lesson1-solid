package lesson2.prototype;

public class Main {
    public static void main(String[] args) {
        var paymentMethod = new  PaymentMethod("John", "Debit", 1L);
        var paymentVersion = new PaymentVersion(paymentMethod);
        var copyOfMethods = paymentVersion.copyOfPayment();
        System.out.println(copyOfMethods);
    }
}
