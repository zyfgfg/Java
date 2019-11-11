package thirteen.practise03;

public class LockDemo extends Thread{
     static Object  o1=new Object();
     static Object   o2=new Object();
    private Object flag;

    public LockDemo(Runnable target, String name) {
        super(target, name);



}

    public void setFlag(boolean flag) {this.flag=flag;
    }
}

