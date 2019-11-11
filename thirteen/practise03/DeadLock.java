package thirteen.practise03;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static sun.misc.GThreadHelper.lock;
import static sun.misc.GThreadHelper.unlock;

public class DeadLock implements Runnable{

static int x;
    boolean  flag;
    Lock lock=new ReentrantLock();

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag) {
            synchronized (LockDemo.o1) {
                System.out.println(Thread.currentThread().getName() + ":你先给我栗子");
                synchronized (LockDemo.o2) {
                    System.out.println(Thread.currentThread().getName() + ":你先给我栗子");
                }
            }
        }else{
        synchronized (LockDemo.o2){
        System.out.println(Thread.currentThread().getName()+":你先给我苹果");
synchronized (LockDemo.o1){
    System.out.println(Thread.currentThread().getName()+":你先给我苹果");
}
        }}}}



