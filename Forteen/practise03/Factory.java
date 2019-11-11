package Forteen.practise03;

import java.util.concurrent.CountDownLatch;

public class Factory {
    int j;

    Factory() {
        j = 0;
    }
CountDownLatch cd =new CountDownLatch(2);
    boolean flag=true;
    synchronized void add() {
        j++;
        System.out.println(Thread.currentThread().getName() + ":" + j);
    }

    synchronized void min() {
        j--;
        System.out.println(Thread.currentThread().getName() + ":" + j);



}}







