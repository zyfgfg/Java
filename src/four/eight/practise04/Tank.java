package four.eight.practise04;
//定义一个Tank类(坦克类)，为其定义x（横坐标），y（纵坐标），dir（方向：值为上下左右），Type（类型）4个属性，其访问修饰符均为公有；
//        为Tank类定义一个构造方法实现4个字段的初始化
//        为Tank类定义一个ShowData方法，控制台打印4个字段值
//        创建一个Tank对象，横坐标为10，纵坐标为50，方向为右，类型为重型坦克，并通过调用对象的ShowData()方法打印Tank信息





public class Tank {
private int x;
private int y;
private String dir;
private String Type;
public  Tank(int x,int y, String dir,String Type) {
    this.x = x;
    this.y = y;
    this.dir = dir;
    this.Type = Type;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


    public void ShowData(){
        System.out.println("横坐标为："+x);
        System.out.println("纵坐标为："+y);
        System.out.println("方向为："+dir);
        System.out.println("类型为："+Type);
}






}
