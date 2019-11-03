package six.practise07;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;/**.编程. 已知字符串：”this is a test of java”.

        按要求执行以下操作：

        (1) 统计该字符串中字母s出现的次数

        (2) 取出子字符串”test”

        (3) 将本字符串复制到一个字符数组Char[] str中.

        (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。

        (5) 用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)

        (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台*/
public class Class{
    public static void main(String[] args) {
        String s = "this is a test of java";
        int n = (s.split("s")).length - 1;
        System.out.println("s出现的次数" + n);

        String b = s.substring(10, 14);
        System.out.println("取出字符串" + b);

        String[] c = s.split(" ");
        System.out.print("数组为:");
        System.out.println(Arrays.toString(c));

        System.out.print("首字母大写后：");
        for (int i = 0; i < c.length; i++) {
            System.out.print(String.valueOf(StringUtils.capitalize(c[i])) + " ");
        }

        System.out.println();
        StringBuffer s1 = new StringBuffer(s).reverse();
        System.out.println("倒序结果" + s1);

        System.out.println(Arrays.toString(c));
    }
}

