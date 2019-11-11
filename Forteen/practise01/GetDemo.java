package Forteen.practise01;

public class GetDemo extends Thread{
 Person p;


    public GetDemo(Person p){
     this.p=p;
 }
    @Override
    public void run() {
        System.out.println(p.name+"已购买到");    }
}
