package two;

import java.util.Scanner;

public class practises03 {
    public static void main(String[] str) {
        System.out.println("请输入数字：");
        Scanner cin=new Scanner(System.in);
        int X=cin.nextInt();
        System.out.println(((X % 2) == 0 )? "偶数" : "奇数");
    }
}