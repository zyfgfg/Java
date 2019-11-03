package four.eight.practsie03;
import java.util.Scanner;
// 1) 创建一个学生类
//         2) 创建四个私有的字段:name,sex,age,dire
//         3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,age 1-60,dire方向只能是.net或java
//         4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息
public class Studenttest {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Student []st=new Student[20];
        System.out.println("请输入名字");
        String name=sc.next();
        int length=name.length();
        if(length>4)
        {System.out.println("输入错误");}
        System.out.println("请输入性别");
        String sex=sc.next();
        if("男".equals(sex)==false||"女".equals(sex)==false)
        {System.out.println("输入错误");}
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        if(age>60||age<1)
        {System.out.println("输入错误");}
        System.out.println("请输入方向");
        String dire=sc.next();
        if(".net".equals(dire)==false||".java".equals(dire)==false)
        {System.out.println("输入错误");}
        Student Student=new Student(name,sex,age,dire);
        st[0]=Student;
        System.out.println(st[0]);

    }
}
