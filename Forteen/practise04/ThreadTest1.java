package Forteen.practise04;

public class ThreadTest1 {public static void main(String[] args) {
    Thread t1 = new Thread(new Work(null));
    Thread t2 = new Thread(new Work(t1));
    Thread t3 = new Thread(new Work(t2));
    t1.start();
    t2.start();
    t3.start();

}
}
