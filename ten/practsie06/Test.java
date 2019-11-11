package ten.practsie06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
2.使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
*/
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet has=new HashSet();
        System.out.println("输入：");
        String st=sc.nextLine();
char[] ch=st.toCharArray();
for(Character cha:ch){
    has.add(cha);
}
        for (Object d : has) {
            System.out.print(d);

        }


    }
}
