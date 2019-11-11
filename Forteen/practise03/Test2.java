package Forteen.practise03;


public class Test2 {

    public static void main(String[] args) {
        Factory factory = new Factory();
        T1 t1 = new T1(factory);
        T2 t2 = new T2(factory);
        t2.setName("减线程1");

        T2 t3 = new T2(factory);
        t3.setName("减线程2");

        Thread thread1 = new Thread(t1, "加线程1");
        Thread thread2 = new Thread(t1, "加线程2");

        thread1.start();
        thread2.start();
        t2.start();
        t3.start();
    }


    }