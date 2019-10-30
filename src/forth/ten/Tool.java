package forth.ten;

import java.util.Scanner;

//现在在一个工具类 Tool里面有一个方法用来查找在三个不同班级里面的学生重名的功能
//        每个班级10个学生,
//        如果查到学生姓名有一样的,
//        这个方法就返回所有的学生对象并且输出满足条件对象信息
public class Tool {
    public void display(String[] args) {


Student display=new Student("资源","12","n1234","三年一班");
    Scanner input = new Scanner(System.in);

    Student []stus=new Student[30];
    int StuNum = input.nextInt();
        for (int i = 0; i < 30; i++) { //循环声明学生类对象插入到数组中
        Student stu=new Student("name","age","number","Class");
        stus[i] = stu;
    }
    }

    public void duplicateName(String stus[]){//比较姓名
        for (int i = 0; i < 30; i++) {


        if (stus[i].equals(stus[i+1])){;
        System.out.println(stus[i]);}

    }}}

