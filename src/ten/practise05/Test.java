package ten.practise05;

import java.util.Random;
import java.util.TreeSet;


/**
1.编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台
*/
public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        TreeSet sc=new TreeSet();
        int count=0;
        while (sc.size()<10){


            int um=random.nextInt(20)+1;
            if(um>=1&&um<=20){sc.add(um);

        }}
for(Object i:sc){
    System.out.println(i+"  ");
}

    }

}


