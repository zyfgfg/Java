package forth.nine.practise04;

public class Banktest {
    public static void main(String[] args) {
        Bank sc=new Bank("张三的账户","张三","1212-12-12",1313,20000);
        sc.deposit(2000);
        sc.drawMoney(2334);

        int balance =sc.obtainBalance();
        System.out.println(sc.getTime());


        System.out.println(balance);


    }
}
