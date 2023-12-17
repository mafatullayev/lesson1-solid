package lesson2.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before, playerDb2 added:");
        var playerDb = PlayerDb.playerDb();
        playerDb.addPlayer("Player 1");
        playerDb.addPlayer("Player 2");
        playerDb.showHistory();

        System.out.println("After, playerDb2 added:");
        var playerDb2 = PlayerDb.playerDb();
        playerDb2.addPlayer("Player 3");
        playerDb2.showHistory();
    }
}
