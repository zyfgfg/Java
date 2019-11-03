package six.practise08;
/**2 .如下字符串：

        01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21

        分割出每个人的信息，样式如下：

        01 张三 20

        02 李四 18

        …..*/
public class Person {
    public static void main(String[] args) {
        String st="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21\n";
        String as = "";
        String[] strs = st.split("#");
        for (int i = 0; i < strs.length; i++) {
            as+=strs[i]+" ";
        }
        String[] str1 = as.split("\\*");

        for (int i = 0; i <str1.length ; i++) {
            System.out.println(str1[i]);


            }

        }


    }

