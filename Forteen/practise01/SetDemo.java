package Forteen.practise01;

public class SetDemo extends Thread{
    Person p;
   public SetDemo(Person p){
       this.p=p;

    }
    @Override
    public void run() {p.name="货物";

        System.out.println(p.name+"已生产出");
   }
}
