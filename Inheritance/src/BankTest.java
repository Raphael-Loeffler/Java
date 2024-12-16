import java.util.Arrays;
import java.util.List;
public class BankTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Leon", 2, 'm');
        Customer c2 = new Customer("Pranit", 20, 'm');
        List<BankAccount> c1Accounts = Arrays.asList(new BankAccount("Private", c1, 1000, "SpeedUp"), new BankAccount("Business", c1, 50000, "Balance"));
        List<BankAccount> c2Accounts = Arrays.asList(new BankAccount("Private", c2, 2000, "Savings"), new BankAccount("Business", c2, 0, "Balance"));
        c1.createAccount(c1Accounts.getFirst());
        //c1.createAccount(c1Accounts.get(1));
        c2.createAccount(c2Accounts.getFirst());
        //c2.createAccount(c2Accounts.get(1));
        c1.generateStatus();
        c1.sendMoney("Private", c2, "Private", 100);
        c1.generateStatus();
        c2.generateStatus();
    }
}
