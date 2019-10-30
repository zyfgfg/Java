package banyuan.second;
import java.util.*;
        public class practises01 {
            public practises01() {
            }

            public static void main(String[]args){
                Scanner sc=new  Scanner(System.in);
                System.out.println("请输人第一个数");
                int  num1=sc.nextInt();
                System.out.println("请输人第二个数");
                int  num2=sc.nextInt();
                System.out.println("请输人第三个数");
                int  num3=sc.nextInt();
                System.out.println("数据总和为"+(num1+num2+num3));
                System.out.println("第一个数"+num1+"和第二数"+num2+"的差是"+(num1>num2?num1-num2:num2-num1));
                System.out.println("第二个数"+num1+"和第三数"+num2+"的差是"+(num2>num3?num2-num3:num3-num2));
                System.out.println("第一个数"+num1+"和第三数"+num2+"的差是"+(num1>num3?num1-num3:num3-num1));






}
}
