package thirteen.practise02;

public class Runable extends Thread{
    public Runable(Runnable target, String name) {
        super(target, name);
    }
}
