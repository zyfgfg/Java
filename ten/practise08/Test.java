package ten.practise08;

import java.util.*;

/**1.分析以下需求，并用代码实现：
 (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 (2)编写方法对List集合进行排序
 (2)然后利用迭代器遍历集合元素并输出
 (3)如：15 18 20 40 46 60 65 70 75 91*/
public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        List sc=new ArrayList();
        while (sc.size()<10){
            int um=random.nextInt(100)+1;
            if(um>=1&&um<=100){
                sc.add(um);
            }}
        ppp(sc);
        Iterator i = sc.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() +"  ");
        }
    }
    public static void ppp(List list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Object obj1 = list.get(i);
                int i1 = (int) obj1;
                Object obj2 = list.get(j);
                int i2 = (int) obj2;
                if (i1 > i2) {
                    list.set(i, list.get(j));
                    list.set(j, obj1);


                }
            }
        }}}
