package forth.nine.practise02;
//创建一个Rectangle类。
//        该类拥有属性length和width，
//        每个属性的默认值均为1。
//        该类拥有方法perimeter和area，
//        分别用于计算矩形的周长和面积。
//        该类还有设置和读取属性length和width的方法。
//        并测试Rectangle类的使用。  
public class Rectangle {
    public int length=1;
    public int width=1;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length) {
        this.length = length;
    }

    public Rectangle(int legth, int width) {
        this.length = legth;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';}

    public void permeter(){
        System.out.println("周长是"+(2*(length+width)));

    }
public void area(){
        System.out.println("周长是"+(length*width));

    }



}
