package Forteen.practise02;

public class Tools3 extends Thread{
    MyThread myThread;
    public Tools3(MyThread myThread ){
        this.myThread=myThread;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (myThread) {
                if (myThread.count <= 75) {
                    if(myThread.number==3) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("线程三:" + (myThread.count++));
                        }
                        myThread.number=1;
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
