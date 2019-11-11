package thirteen.practise04;

public class Test {
    public static void main(String[] args) {


Bank x=new Bank();
// 实例化两个人，传入同一个银行的对象
Tools1 sc=new Tools1(x,"柜台");
Tools2 ss=new Tools2(x,"ATM");
sc.start();
ss.start();
}}
