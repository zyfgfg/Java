package Forteen.practise03;

import java.util.concurrent.CountDownLatch;

class T1 implements Runnable{
     Factory factory = null;

     T1(Factory factory) {
         this.factory = factory;
     }
     public int T1() {
         return 1;
     }

     @Override
     public void run() {
         while(true) {
             synchronized (factory) {
                 if (factory.flag) {
                     if (factory.cd.getCount() > 0) {
                         factory.add();
                         factory.cd.countDown();
                         try {
                             Thread.sleep((int) Math.random() * 10);
                         } catch (InterruptedException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                         }}else{
                         factory.flag=!factory.flag;
                         try {
                             factory.cd.await();
                             factory.cd=new CountDownLatch(2);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }

                     }
                     }
                 }
             }}}




