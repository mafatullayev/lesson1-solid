package lesson1.o;

public class Account {
    private Long id;
    private final String username;

    public Account(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}