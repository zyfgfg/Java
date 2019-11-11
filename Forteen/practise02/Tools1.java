package Forteen.practise02;

public class Tools1 extends Thread {
    MyThread myThread;

    public Tools1(MyThread myThread) {
        this.myThread = myThread;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (myThread) {
                if (myThread.count<= 75) {
                    if (myThread.number == 1) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println( "线程一:" + myThread.count++);
                        }

                        myThread.number = 2;
                    }

                    try {
                        myThread.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }





    }
}