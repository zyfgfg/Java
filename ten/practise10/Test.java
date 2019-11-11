package ten.practise10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**3.把如下元素存入List集合
 “aaa” “bbb” “aaa” “abc”“xyz” “123” “xyz”
 去掉重复元素*/
public class Test {
    public static void main(String[] args) {


    List list=new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("aaa");
    list.add("abc");
    list.add("xyz");
    list.add("123");
    list.add("xyz");
    HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        System.out.println("去掉重复元素后：");
        System.out.println(list);




    }}
