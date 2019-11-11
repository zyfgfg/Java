package Forteen.practise01;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        SetDemo sr=new SetDemo(p);
        GetDemo ss=new GetDemo(p);


        sr.start();
        ss.start();
    }
}
