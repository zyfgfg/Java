package six.practise05;


/**
 * 4.编写一个程序，设定一个有大小写和以及非大小写的字符串
 * 分别统计大小写的字符的个数和非大小写字符的个数，
 * 并且分别把大小写字符和非大小写字符输出字符串
 */
public class Word {

    public static void main(String[] args) {
        String str = "dfsih2385276587ERXFGFGYCHJVUSD";
        char s[] = str.toCharArray();
        int char_num = 0;
        int num = 0;
        int other = 0;
        char[] nu = new char[20];
        char[] y = new char[20];
        char[] x = new char[30];

        for (int i = 0; i < s.length; i++) {
            if (s[i] <= '9' && s[i] >= '0') {
                nu[char_num] = s[i];
                char_num++;
            } else if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')){
                x[num] = s[i];
                num++;
            } else {
                y[other] = s[i];
                other++;
            }
        }
        System.out.println("非大小写字符：");
        for (int i = 0; i < char_num; i++) {
            if (nu[i]!='\0') {
                System.out.print(nu[i]);}
        }
        System.out.println("\n大小写字符：");for (int i = 0; i < num; i++) {
            if (x[i]!='\0') {


            System.out.print(x[i]);}

        }
        System.out.println();
        System.out.println("字符有" + char_num + "个;数字有" + num + "个;其他字符有" + other + "个");

    }




}






