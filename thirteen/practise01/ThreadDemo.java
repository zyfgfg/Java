package thirteen.practise01;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        RunableDemo thread1=new RunableDemo(m1,"x");
        RunableDemo thread2=new RunableDemo(m1,"y");
        RunableDemo thread3=new RunableDemo(m1,"z");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
