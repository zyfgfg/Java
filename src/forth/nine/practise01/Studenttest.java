package forth.nine.practise01;
//定义一个学生类Student，包括 ID、name、sex、age等成员变量；
//        要求有构造方法并有构造方法的重载，
//        有相关成员方法来设置及获取其成员变量的值用输出成员信息的成员方法。
//        并创建一个测试类，
//        用不同的构造方法创建2个Student类的对象，
//        调用相关的方法设置对象的成员变量值，并输出相关信息
public class Studenttest {
    public static void main(String[] args) {
        Student sc=new Student(1234,"sdsd","男",23);
        System.out.println(sc.toString());
        sc.setAge(122);
        sc.setID(1213);
        sc.setName("sdd");
        sc.setSex("女");
        System.out.println(sc.toString());
    }
}
