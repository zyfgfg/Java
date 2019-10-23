package banyuan.cn;
import java.util.*;
import java.io.*;
public class practise04 {
    public static void main(String[] args){int i=0,j=0;
        System.out.println("请输入边长：");
        Scanner cin=new Scanner(System.in);
        int len=cin.nextInt();
        for ( i = 1; i <= len; i++) {
            for ( j = 0; j < len - i; j++) {
                System.out.print(' ');
            }

            for ( j = 0; j < (i - 1) * 2 + 1; j++) {
                System.out.print('*');
            }

            System.out.print('\n');
        }
        for (i = 1; i <= len; i++) {
            for (j = 0; j < i - 1; j++) {
                System.out.print(' ');            }

            for (j = 0; j < (len - i) * 2 + 1; j++) {
                System.out.print('*');            }

            System.out.print('\n');        }






    }


}
