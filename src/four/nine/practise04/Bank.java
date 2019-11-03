package four.nine.practise04;

//设计一个银行账户类，
//        其中包括：账户信息：账号、姓名、开户时间、身份证号码、账户上的金额等成员。
//        有：存款方法、取款方法、显示开户时间的方法、获得账上的金额的方法等。
//        并编写测试类
public class Bank {
    public String account;
    public String name;
    public String date;
    public int Id;
    public int balance;

    public Bank(String account, String name, String date, int id, int balance) {
        this.account = account;
        this.name = name;
        this.date = date;
        Id = id;
        this.balance = balance;
    }

    public void deposit(int amout) {
        balance += amout;
    }

    public void drawMoney(int amout) {
        if (amout <= balance)
            balance -= amout;
    }
    public int obtainBalance(){
        return balance;
    }
    public String getTime(){
        return date;
    }


}
