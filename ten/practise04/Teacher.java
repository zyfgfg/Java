package ten.practise04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
3.已知某学校的教学课程内容安排如下：

完成下列要求：
1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
课程安排。
2） 增加了一位新老师Allen 教JDBC
3） Lucy 改为教CoreJava
4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key))
5） 利用Map，输出所有教JSP 的老师。*/
public class Teacher {
    public static void main(String[] args) {


    Map<String, String> map=new HashMap<String, String>();
    map.put("Tom","CoreJava");
    map.put("John","Oracle");
    map.put("Suan","Oracle");
    map.put("Jerry","JDBC");
    map.put("Jim","Unix");
    map.put("Kevin","JSP");
    map.put("Lucy","JSP");
    map.put("Alen","JDBC");
    map.put("Lucy","CoreJava");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        // 利用Map，输出所有教JSP 的老师。
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue().equals("JSP"))
                    System.out.println("教JSP的老师是："+entry.getKey());
            }






    }}
