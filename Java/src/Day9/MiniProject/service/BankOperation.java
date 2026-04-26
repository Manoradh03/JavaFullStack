package Day9.MiniProject.service;

public interface BankOperation {
    void deposit(int accNo,double amount);
    void withdraw(int accNo,double amount);
    void checkbalance(int accNo);
}