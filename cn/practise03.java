package banyuan.cn.cn;
import java.util.Scanner;
public class practise03 {public static void main(String[] args){ int count=0;
    System.out.println("请输入名字");
    Scanner in =new Scanner(System.in);
    String name_1=in.nextLine();

    System.out.println("请再输入名字");
    Scanner se =new Scanner(System.in);
    String name_2=se.nextLine();
    while(name_1.equals(name_2)!=true){
        System.out.println("名字不一致！！！请再输入名字");
        name_2=se.nextLine();
    }
    System.out.println("请输入密码");
    Scanner on =new Scanner(System.in);
    String secret_1=in.nextLine();
    System.out.println("请再输入密码");
    Scanner cr =new Scanner(System.in);
    String secret_2=in.nextLine();

    if(secret_1.equals(secret_2)!=true) {
        System.out.println("密码不一致！！！请再输入密码");
        secret_2 = in.nextLine();
        count++;
        if (count == 3) {return;
        }

    }

}
}
