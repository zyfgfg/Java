package banyuan.first;
import java.util.*;


public class practise04 {
    public static void main(String[] args){int i=0,j=0;
        System.out.println("请输入边长：");
        Scanner cin=new Scanner(System.in);
        int len=cin.nextInt();
        for ( i = 1; i <= 2*len; i++) {
            for ( j = 0; j < 2*(len - i); j++) {
                System.out.print(' ');
            }

            for ( j = 0; j < (i - 1) * 2 + 1; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
        for (i = 2; i <= len; i++) {
            for (j = 0; j < i - 1; j++) {
                System.out.print(' ');            }

            for (j = 0; j < (len - i) * 2 + 1; j++) {
                System.out.print('*');            }

            System.out.println();        }






    }


}
