package Forteen.practise02;


public class Test {
    public static void main(String[] args) {


MyThread my=new MyThread();
Tools1 w =new Tools1(my);
Tools2 s =new Tools2(my);
Tools3 z =new Tools3(my);
Tools4 c=new Tools4(my);
w.start();
s.start();
z.start();
c.start();
}}
