package five.practise02;
public class Frog extends Animal implements Ability{
    @Override
    public void swimming() {
        System.out.println("虽然不是鱼，但青蛙也是泳坛高手");


    }

    @Override
    public void eat() {

        System.out.println("兔子是"+this.getType()+",爱吃昆虫");

    }
    @Override
    public void shout() {

        System.out.println("那只"+this.getColor()+"的，名叫"+this.getName()

                +"的青蛙正在呱呱的叫");

    }



}


