package Day7;

public class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}