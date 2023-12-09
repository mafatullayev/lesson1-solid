package lesson1.o;

public class EnterAccountToWeb implements Enter{
    @Override
    public void enter(Account account) {
        System.out.println("Account: " + account.getUsername() + " entering to the web: " + account.getId());
    }
}
