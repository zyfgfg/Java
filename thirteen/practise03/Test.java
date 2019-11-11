package thirteen.practise03;

public class Test  {
    public static void main(String[] args) {

        DeadLock  mt1=new DeadLock();
        LockDemo sc=new LockDemo(mt1,"A");
        mt1.setFlag(true);

        DeadLock  mt2=new DeadLock();
        LockDemo ss=new LockDemo(mt2,"B");
        mt2.setFlag(false);

        sc.start();

        ss.start();
    }
}
