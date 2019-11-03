package six.practise04;

import java.util.Scanner;

/**3.编写敏感词过滤器。
        比如:恐怖   爆炸  性   枪  军火 色情 等
        如果出现这些字眼 就用**代替,输入一句话其中包含敏感字符
        最终输出屏蔽之后的数据*/


public class XXX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String word=sc.next();

        if(word.contains("恐怖")){
            System.out.println(word.replace("恐怖","**"));}
             if(word.contains("爆炸")){
            System.out.println(word.replace("爆炸","**"));}
             if(word.contains("性")){
            System.out.println(word.replace("性","**"));}
         if(word.contains("枪")){
            System.out.println(word.replace("枪","**"));}
                         if(word.contains("军火")){
                System.out.println(word.replace("军火","**"));}
                             if(word.contains("色情")){
                    System.out.println(word.replace("色情","**"));}
                             else {
                                 System.out.println(word);
                             }

    }

    }


