package forth.eight.practise04;
//定义一个Tank类(坦克类)，为其定义x（横坐标），y（纵坐标），dir（方向：值为上下左右），Type（类型）4个属性，其访问修饰符均为公有；
//        为Tank类定义一个构造方法实现4个字段的初始化
//        为Tank类定义一个ShowData方法，控制台打印4个字段值
//        创建一个Tank对象，横坐标为10，纵坐标为50，方向为右，类型为重型坦克，并通过调用对象的ShowData()方法打印Tank信息
public class testTank {
    public static void main(String[] args) {
        Tank tank=new Tank(10,50,"右","重型坦克");
tank.ShowData();
    }
}
