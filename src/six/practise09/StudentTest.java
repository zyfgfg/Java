package six.practise09;

import java.util.Scanner;

/**
 * 创建Student类，属性：学号 姓名 年龄
 * <p>
 * 1将这些Student对象放进数组中
 * <p>
 * 2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
 * <p>
 * 3.计算所有学生的平均年龄，最大年龄，最小年龄
 * <p>
 * 4.如果存在名字叫张三的将名字改为张兵
 */


public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] person = new Student[20];
        int[] p = new int[20];
        int max, min;
        int i = 0;
        int number = 0;
        for (int j = 0; j < 3; j++) {

            System.out.println("请输入学号");
            String num = sc.next();
            System.out.println("请输入姓名");
            String name = sc.next();
            if ("张三".equals(name)) {
                name = "张兵";
            }

            System.out.println("请输入年龄");
            int age = sc.nextInt();
            p[j] = age;
            person[j] = new Student(num, name, age);
            if (name.contains("田七")) {
                System.out.println(person[j]);
            }
            number += age;

        }
        min = min(p[0], p[1], p[3]);
        max = max(p[0], p[1], p[2]);
        System.out.println("平均年龄" + (number / 3));
        System.out.println("最大年龄" + max);
        System.out.println("最小年龄" + min);
        for (int j = 0; j < 3; j++) {
            System.out.println(person[j].toString());
        }
    }


    public static int max(int as, int ab, int ac) {
        int max=0;
        if (ab > as) {
            max = ab;

        } else {
            max = as;

        }
        if (ac > max) {
            max = ac;
        }
        return max;
    }

    public static int min(int as, int ab, int ac) {
        int min=(as<ab)?as:ab;
        min=(min<ac)?min:as;
       return min;
    }

}
