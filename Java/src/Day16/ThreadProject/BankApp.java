package Day16.ThreadProject;

import Day16.ThreadProject.model.Account;
import Day16.ThreadProject.service.BankService;
import Day16.ThreadProject.threads.DepositThread;
import Day16.ThreadProject.threads.WithdrawThread;

public class BankApp {

    public static void main(String[] args) {

        Account acc = new Account(1000);

        BankService service = new BankService(acc);

        Thread d = new Thread(new DepositThread(service));
        Thread w = new Thread(new WithdrawThread(service));

        d.start();
        w.start();
    }
}