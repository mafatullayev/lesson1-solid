package lesson1.l;

public class DebitCard implements Card {
    private int debitorAmount;

    public DebitCard(int debitorAmount) {
        this.debitorAmount = debitorAmount;
    }

    public int getDebitorAmount() {
        return debitorAmount;
    }

    @Override
    public int getAmount() {
        return debitorAmount;
    }
}
