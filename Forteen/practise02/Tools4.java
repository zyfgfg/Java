package Forteen.practise02;

public class Tools4 extends Thread {
    MyThread myThread;
    public Tools4(MyThread myThread){
        this.myThread=myThread;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (myThread) {
                myThread.notifyAll();
            }
        }
    }



}
