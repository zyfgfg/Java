package ten.practise01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {
    public static <map> void main(String[] args) {
        Map map = new HashMap();
        Map map3 = new HashMap();
        Map map4 = new HashMap();
        Map map5 = new HashMap();
        map.put("关羽", "刘国泰");
        map.put("张飞", "刘国泰");
        map.put("赵子龙", "刘国泰");
        map.put("黄忠", "刘国泰");
        map.put("马超", "刘国泰");
        Map map1 = new HashMap();
        map1.put("典韦", "刘国泰");
        map1.put("郭嘉", "刘国泰");
        map1.put("张辽", "刘国泰");
        map1.put("许褚", "刘国泰");
        map1.put("荀彧", "刘国泰");
        Map map2 = new HashMap();
        map2.put("周瑜", "刘国泰");
        map2.put("黄盖", "刘国泰");
        map2.put("鲁肃", "刘国泰");
        map2.put("陆逊", "刘国泰");
        map2.put("吕蒙", "刘国泰");
        map3.put(map, "刘备");
        map4.put(map1, "曹操");
        map5.put(map2, "孙权");
        Set set = map3.keySet();
        Set set1 = map4.keySet();
        Set set2 = map5.keySet();
        for (Object t : set) {
            System.out.println(map3.get(t));
            for (Object x : set) {
                Map y = (Map) x;
                Set z = y.keySet();
                for (Object cc : z) {
                    System.out.println("    " + cc + "的老婆" + y.get(cc));
                }

            }
        }for (Object t : set1) {
            System.out.println(map4.get(t));
            for (Object x : set1) {
                Map y = (Map) x;
                Set z = y.keySet();
                for (Object cc : z) {
                    System.out.println("   " + cc + "的老婆" + y.get(cc));
                }

            }
        }for (Object t : set2) {
            System.out.println(map5.get(t));
            for (Object x : set2) {
                Map y = (Map) x;
                Set z = y.keySet();
                for (Object cc : z) {
                    System.out.println("   " + cc + "的老婆" + y.get(cc));
                }

            }
        }
    }
}
