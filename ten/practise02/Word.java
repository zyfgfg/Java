package ten.practise02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**1.分析以下需求，并用代码实现：
(1)统计每个单词出现的次数
(2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
(3)打印格式：
to=3
think=1
you=2*/
public class Word {
    public static void main(String[] args) {
        String sc="If you want to change your fate I think you must come to the ujiuye to learn java";
        String[]  strs=sc.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String key : strs) {
            // 查看是否存在该单词
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }}

Set<String>keySet=map.keySet();
        // 获取对象
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
             String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}




