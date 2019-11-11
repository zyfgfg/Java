package Forteen.practise05;

import Forteen.practise04.Work;

public class ThreadTest2 {public static void main(String[] args) {
    Thread t1 = new Thread(new Forteen.practise04.Work(null));
    Thread t2 = new Thread(new Forteen.practise04.Work(t1));
    Thread t3 = new Thread(new Work(t2));
    t1.start();
    t2.start();
    t3.start();

}

}
