package thirteen.practise02;

public class Test {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        Runable x1=new Runable(m1,"x");
        Runable x2=new Runable(m1,"x1");
        Runable x3=new Runable(m1,"x2");
        Runable x4=new Runable(m1,"x3");
        Runable x5=new Runable(m1,"x4");
        Runable x7=new Runable(m1,"x5");
        Runable x6=new Runable(m1,"x6");
        Runable x8=new Runable(m1,"x7");
        Runable x9=new Runable(m1,"x8");
        Runable x10=new Runable(m1,"x9");
        x1.start();
        x2.start();
        x3.start();
        x4.start();
        x5.start();
        x6.start();
        x7.start();
        x8.start();
        x9.start();
        x10.start();
    }

}
