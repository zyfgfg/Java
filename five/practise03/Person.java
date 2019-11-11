package five.practise03;
/**3. 春节回家，小明、小王、小李。三个步骤：
①买票②使用交通工具③回家过年①与③两个步骤相同，已经实现了，
②工具不同，分别是小明坐大巴，小王坐火车，小李坐飞机，
        请设计出他们的关系。并打印出每个人回家的三步骤*/


public abstract class Person {
    void goHome(){
        System.out.println("回家过年");

    }
    void tickets(){
        System.out.println("买票");
    }
    abstract void tools();
    void methods(){
        tickets();
        tools();
        goHome();

    }


}
