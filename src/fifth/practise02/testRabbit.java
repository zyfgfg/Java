package fifth.practise02;

public class testRabbit {
    public static void main(String[] args) {

    Rabbit r=new Rabbit();

    Frog f=new Frog();

    f.setName("大冰");

    f.setColor("绿色");

    f.setType("非哺乳类");

    r.setName("美人");

    r.setColor("黑色");

    r.setType("哺乳类");

//"美人","黑色","哺乳类"

    r.shout();

    r.eat();

    System.out.println("====================");

    f.shout();

    f.eat();

    f.swimming();

}

}


