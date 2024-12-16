import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String name;
    private Customer owner;
    private double balance;
    public List<String> history;
    private List<Customer> transactionPartners;
    private LocalDate lastUsageDate;
    private String accountType;
    public BankAccount(String name, Customer owner, double startingBalance, String accountType) {
        this.name = name;
        this.owner = owner;
        this.balance = startingBalance;
        this.accountType = accountType;
        this.transactionPartners = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public void represent() {
        System.out.println(this.name + " account");
        System.out.println("Account type: " + this.accountType);
        System.out.println("The number of transaction partners: " + this.transactionPartners.size());
        System.out.println("Last account usage happened " + this.lastUsageDate);
        System.out.println("The actual balance is: " + this.balance);
    }

    public String getName() {
        return name;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return history;
    }

    public List<Customer> getTransactionPartners() {
        return transactionPartners;
    }

    public LocalDate getLastUsageDate() {
        return lastUsageDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public void setTransactionPartners(List<Customer> transactionPartners) {
        this.transactionPartners = transactionPartners;
    }

    public void setLastUsageDate(LocalDate lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
    }
}
