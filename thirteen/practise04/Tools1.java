package thirteen.practise04;

public class Tools1 extends Thread{
    Bank bank;

    String mode;

    public Tools1(Bank bank, String mode) {
        this.mode = mode;
        this.bank = bank;
    }

    @Override
    public void run (){
        while(Bank.money >= 100){
            try {
                bank.outMoney(100, mode);
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


