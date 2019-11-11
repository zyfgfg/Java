package ten.practise03;

import java.util.HashMap;
import java.util.Map;

/**
2.使用包装类作为键给map集合添加数据和使用对象作为键添加数据
*/
public class Test {
    public static void main(String[] args) {
        Map map=new HashMap();

map.put(new Student("zy","23"),"成年人") ;
System.out.println(map);
    }
}
