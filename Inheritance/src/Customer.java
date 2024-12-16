import java.security.InvalidParameterException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int age;
    private char gender;
    private List<BankAccount> bankAccounts;

    public Customer(String name, int age, char gender, List<BankAccount> bankAccounts) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bankAccounts = bankAccounts;
    }

    public Customer(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bankAccounts = new ArrayList<>();
    }

    public void createAccount(BankAccount account) {
        boolean isAlreadyThere = false;
        for (BankAccount iteratorAccount : this.bankAccounts) {
            if (iteratorAccount.getName().equals(account.getName())) {
                isAlreadyThere = true;
            }
        }
        if (isAlreadyThere) {
            System.out.println("No account name duplication is allowed");
        } else {
            this.bankAccounts.add(account);
        }
    }

    public void sendMoney(String senderAccountName, Customer partner, String partnerAccountName, int amount) {
        try {
            int thisIndex = 0;
            for (int i = 0; i < this.bankAccounts.size(); i++) {
                if (this.bankAccounts.get(i).getName().equals(senderAccountName)) {
                    thisIndex = i;
                }
            }
            int partnerIndex = 0;
            for (int i = 0; i < partner.bankAccounts.size(); i++) {
                if (partner.bankAccounts.get(i).getName().equals(partnerAccountName)) {
                    partnerIndex = i;
                }
            }
            this.bankAccounts.get(thisIndex).setBalance(this.bankAccounts.get(thisIndex).getBalance() - amount);
            this.bankAccounts.get(thisIndex).setLastUsageDate(LocalDate.now());
            if (this.bankAccounts.get(thisIndex).getName().equals("Savings")) {
                partner.receiveMoney(partnerAccountName, partner, amount);
                this.bankAccounts.get(thisIndex).setBalance(this.bankAccounts.get(thisIndex).getBalance() - 100);
            } else if (this.bankAccounts.get(thisIndex).getName().equals("SpeedUp")) {
                partner.receiveMoney(partnerAccountName, partner, amount);
                this.bankAccounts.get(thisIndex).setBalance(this.bankAccounts.get(thisIndex).getBalance() - 1000);
            } else {
                partner.receiveMoney(partnerAccountName, partner, amount);
                this.bankAccounts.get(thisIndex).setBalance(this.bankAccounts.get(thisIndex).getBalance() - amount * 0.002);
            }
            partner.bankAccounts.get(partnerIndex).history.add(amount + " Ft sent to " + partnerAccountName + " from the account " + senderAccountName + " at " + LocalDate.now());
            boolean alreadyPartner = false;
            for (Customer iteratorAccount : partner.bankAccounts.get(partnerIndex).getTransactionPartners()) {
                if (iteratorAccount.equals(this)) {
                    alreadyPartner = true;
                }
            }
            if (!alreadyPartner) {
                partner.bankAccounts.get(partnerIndex).getTransactionPartners().add(this);
                if (this.bankAccounts.get(thisIndex).getName().equals("SpeedUp")) {
                    this.bankAccounts.get(thisIndex).setBalance(this.bankAccounts.get(thisIndex).getBalance() + 5000);
                }
            }
            this.bankAccounts.get(thisIndex).setLastUsageDate(LocalDate.now());
        } catch (InvalidParameterException e) {
            System.out.println("There is no sender account under the name " + senderAccountName);
        }
    }

    public void receiveMoney(String receiverAccountName, Customer sender,int amount) {
        int index = -1;
        for (int i = 0; i < this.bankAccounts.size(); i++) {
            if (this.bankAccounts.get(i).getName().equals(receiverAccountName)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("There is no receiver account under the name " + receiverAccountName);
        } else {
            this.bankAccounts.get(index).setBalance(this.bankAccounts.get(index).getBalance() + amount);
            if (this.bankAccounts.get(index).getName().equals("Savings")) {
                this.bankAccounts.get(index).setBalance(this.bankAccounts.get(index).getBalance() - 20);
                this.bankAccounts.get(index).history.add(amount - 20 + " Ft received from " + sender.name + " to the account " + receiverAccountName + " at " + LocalDate.now());
            } else if (this.bankAccounts.get(index).getName().equals("Balance")) {
                LocalDate date = LocalDate.now();
                if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    this.bankAccounts.get(index).setBalance(this.bankAccounts.get(index).getBalance() - amount * 0.003);
                    this.bankAccounts.get(index).history.add(amount - amount * 0.003 + " Ft received from " + sender.name + " to the account " + receiverAccountName + " at " + LocalDate.now());
                } else {
                    this.bankAccounts.get(index).setBalance(this.bankAccounts.get(index).getBalance() - amount * 0.001);
                    this.bankAccounts.get(index).history.add(amount - amount * 0.001 + " Ft received from " + sender.name + " to the account " + receiverAccountName + " at " + LocalDate.now());
                }
            } else {
                this.bankAccounts.get(index).setBalance(this.bankAccounts.get(index).getBalance() - 200);
                this.bankAccounts.get(index).history.add(amount - 200 + " Ft received from " + sender.name + " to the account " + receiverAccountName + " at " + LocalDate.now());
            }
            boolean alreadyPartner = false;
            for (Customer iteratorCustomer: this.bankAccounts.get(index).getTransactionPartners()) {
                if (iteratorCustomer == sender) {
                    alreadyPartner = true;
                }
            }
        }
        this.bankAccounts.get(index).setLastUsageDate(LocalDate.now());
    }
    public void generateStatus() {
        for (BankAccount account: bankAccounts) {
            account.represent();
        }
    }
}
    /*
    if (this.bankAccounts.get(index).getName().equals("Savings")) {

        } else if (this.bankAccounts.get(index).getName().equals("SpeedUp")) {

        } else {

        }
     */
