package third;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;

public class practise01 {


    public static void main(String[] args) {
        Student[] person = new Student[10];
        int count = 5;
        Scanner input = new Scanner(System.in);                Scanner []inp = new Scanner[20];
        person[0] = new Student("张四", 23, "南京1");
        person[1] = new Student("张五", 23, "南京2");
        person[2] = new Student("张一", 23, "南京3");
        person[3] = new Student("张二", 23, "南京4");
        person[4] = new Student("张三", 23, "南京5");
        System.out.println("请输入要添加的人数");
        int StuNum = input.nextInt();
        for (int i = 5; i < StuNum + 5; i++) { //增加
            System.out.println("请输入第" + (i + 1) + "学生的信息");
            System.out.print("输入姓名：");
            String name = input.next();
            System.out.print("输入年龄");
            int age = input.nextInt();
            System.out.print("输入地址");
            String address = input.next();
            Student stu = new Student(name, age, address);
            person[i] = stu;
        }

        System.out.println("请输入要修改的人的位置：");
        int x=input.nextInt();
        System.out.print("请输入修改后的名字：");
        person[x].setName(input.next());
        System.out.print("请输入修改后的年龄：");
        person[x].setage(input.next());
        System.out.print("请输入修改后的住址：");
        person[x].setAddress(input.next());
        for(int i=0;i<StuNum+5;i++){
            System.out.println(person[i].toString());
        }
        System.out.println("请输入要删除的人的位置：");
        int y=input.nextInt();
        person[y]=null;
        for(int i=y;i<StuNum+5;i++)
        { person[y]=person[y+1];}
        count--;
        System.out.println("删除成功");
        for(int i=0;i<StuNum+5;i++){
            System.out.println(person[i].toString());
        }

        System.out.println("请输入要查找的人的位置：");
        int z=input.nextInt();
        System.out.println(person[z].toString());
        System.out.println();
        for(int i=0;i<count;i++){
            System.out.println(person[i].toString());
        }





    }
}
