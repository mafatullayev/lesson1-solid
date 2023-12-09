package lesson1.l;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard(10000);
        CreditCard creditCard = new CreditCard(20000);

        System.out.println(debitCard.getDebitorAmount());
        System.out.println(creditCard.getCreditorAmount());
    }
}