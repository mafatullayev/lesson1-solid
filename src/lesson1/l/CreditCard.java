package lesson1.l;

public class CreditCard implements Card {
    private int creditorAmount;

    public int getCreditorAmount() {
        return creditorAmount;
    }

    public CreditCard(int creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    @Override
    public int getAmount() {
        return creditorAmount;
    }
}