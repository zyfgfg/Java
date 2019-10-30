package forth.nine.practise03;
//创建一个名为Fan的类来模拟风扇，该类包含属性speed、on、radius，有合适
//        的构造方法,此外还要求提供一个方法用来设置风扇的速度和开关状态等信息。另外编写一个类来测试Fan的使用。 
public class Fan {
    public String speed;
    public String on;
    public String radius;


    public Fan(String on) {
        this.on = on;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public Fan(String speed, String on, String radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed='" + speed + '\'' +
                ", on='" + on + '\'' +
                ", radius='" + radius + '\'' +
                '}';
    }
}
