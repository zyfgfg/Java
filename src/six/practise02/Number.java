package six.practise02;

import java.util.Scanner;

public class Number {
     public static void main(String[] args) {
            System.out.println("请随机输入一段字符串");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            char s[] = str.toCharArray();
            int char_num=0;
            int num = 0;
            int other = 0;

            for(int i=0;i<s.length;i++)
            {
                if (s[i]<='9'&&s[i]>='0')
                    num++;
                else if (s[i]>='a'&&s[i]<='z'||s[i]>='A'&&s[i]<='Z')
                    char_num++;
                else
                    other++;
            }

            System.out.println("字符有"+char_num+"个;数字有"+num+"个;其他字符有"+other+"个");
        }
    }

