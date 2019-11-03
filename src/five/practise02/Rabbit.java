package five.practise02;

public class Rabbit extends Animal{
    public void eat() {

        System.out.println("兔子是"+this.getType()+",爱吃胡萝卜");

    }


    @Override
    public void shout() {

        System.out.println("那只"+this.getColor()+"的，名叫"+this.getName()

                +"的兔子正在呱呱的叫");

    }

}


