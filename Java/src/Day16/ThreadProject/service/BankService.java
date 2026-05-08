package Day16.ThreadProject.service;

import Day16.ThreadProject.model.Account;

public class BankService {

    Account acc;

    public BankService(Account acc) {
        this.acc = acc;
    }

    public void deposit(double amount) {
        acc.deposit(amount);
    }

    public void withdraw(double amount) {
        acc.withdraw(amount);
    }
}