package Day16.ThreadProject.threads;

import Day16.ThreadProject.service.BankService;

public class WithdrawThread implements Runnable {

    BankService service;

    public WithdrawThread(BankService service) {
        this.service = service;
    }

    public void run() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        service.withdraw(300);
    }
}