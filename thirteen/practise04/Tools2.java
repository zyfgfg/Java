package thirteen.practise04;

import static java.lang.Thread.sleep;

public class Tools2 extends Thread{Bank bank;

    String mode;

    public Tools2(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }

    @Override
    public void run() {
        while (Bank.money >= 200) {
            try {
                bank.outMoney(200, mode);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


