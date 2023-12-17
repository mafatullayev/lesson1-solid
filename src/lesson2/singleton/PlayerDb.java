package lesson2.singleton;

public class PlayerDb {
    private static PlayerDb playerDb;
    public String history = "List of players:\n";

    public static PlayerDb playerDb() {
        if (playerDb == null) {
            playerDb = new PlayerDb();
        }
        return playerDb;
    }

    public void addPlayer(String players) {
        history += players + "\n";
    }
    public void showHistory() {
        System.out.println(history);
    }
}
