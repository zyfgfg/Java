package Forteen.practise05;

import java.util.concurrent.CountDownLatch;

public class Work implements Runnable {
    CountDownLatch c1;
    CountDownLatch c2;

    Work(CountDownLatch c1, CountDownLatch c2) {
        super();
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        try {
            c1.await();//前一线程为0才可以执行
            System.out.println("thread start:" + Thread.currentThread().getName());
            c2.countDown();//本线程计数器减少
        } catch (InterruptedException e) {
        }

    }
}





