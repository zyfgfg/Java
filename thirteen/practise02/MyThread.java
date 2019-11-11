package thirteen.practise02;

public class MyThread implements Runnable {
    static int i=1;
    Object o=new Object();

    @Override
    public void run() {
            synchronized (o){
                    System.out.println(Thread.currentThread().getName()+"是第"+(i++)+"个过山洞的");
                    try {
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }






    }




