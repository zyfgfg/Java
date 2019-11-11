package Forteen.practise04;

public class Work implements Runnable {
    private Thread beforeThread;
    public Work(Thread beforeThread) {
        this.beforeThread = beforeThread;
    }
    @Override
    public void run() {
        if (beforeThread != null) {
            try {
                beforeThread.join();
                System.out.println("thread start:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("thread start:" + Thread.currentThread().getName());
        }
    }
}


