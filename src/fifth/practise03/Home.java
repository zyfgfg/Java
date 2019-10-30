package fifth.practise03;
/**
②工具不同，分别是小明坐大巴，小王坐火车，小李坐飞机，
*/


public class Home {
public static class xiaoming extends Person{
@Override
void tools(){
    System.out.println("小明坐大巴");
}
    }public static class xiaowang extends Person{
@Override
void tools(){
    System.out.println("小王坐火车");
}
    }public static class xiaoli extends Person{
@Override
void tools(){
    System.out.println("小李坐飞机");
}
    }


}
