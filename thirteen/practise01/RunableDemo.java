package thirteen.practise01;

public class RunableDemo extends Thread{
    public RunableDemo(Runnable target, String name) {
        super(target, name);
    }
}
