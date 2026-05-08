package Day16.ThreadProject.threads;

import Day16.ThreadProject.service.BankService;

public class DepositThread implements Runnable {

    BankService service;

    public DepositThread(BankService service) {
        this.service = service;
    }

    public void run() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        service.deposit(500);
    }
}