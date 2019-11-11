package thirteen.practise01;

public class MyThread implements Runnable{

    static int ticket=200;
Object o=new Object();


    @Override
    public void run() {
        while(true){
            synchronized (o){
                if(ticket<401){
                    if(ticket%2==0){
                    System.out.println("再卖第"+(ticket++)+"张票");}
                    else{
                        System.out.println(Thread.currentThread().getName()+"再卖第"+(ticket++)+"张票");
                    }

                try {
                    java.lang.Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        }

    }
}
