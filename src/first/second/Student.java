package banyuan.second;

import java.util.Scanner;
/**
 * @author edz
 *
 *
 * */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHi() {
        System.out.println("我叫 " + name + " 今年" + age + "岁");
    }


    public static void main(String[] args) {
        Student[] stus;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要创建的学生个数：");
        int stuNum = input.nextInt();
        stus = new Student[stuNum];

        //循环声明学生类对象插入到数组中
        for (int i = 0; i < stuNum; i++) {
            System.out.println("请输入第" + (i + 1) + "学生的信息");
            System.out.print("输入姓名：");
            String name = input.next();
            System.out.print("输入年龄");
            int age = input.nextInt();
            Student stu = new Student(name, age);
            stus[i] = stu;
        }

        //循环 遍历访问 数组的每个学生元素 让他们打招呼
        for (int i = 0; i < stus.length; i++) {
            stus[i].sayHi(); }}
        }

