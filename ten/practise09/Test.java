package ten.practise09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**编写一个类Book，具有name,price,press,author
 * 然后创建5个对象
 * 放入ArrayList中，并实现按照price大小排序，
 * 然后遍历ArrayList输出每个Book对象, 使用toString 方法打印。*/
public class Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        Book book=new Book();
        Book b1 = new Book("哪吒", 20, "封神演义出版社", "元始天尊");
        Book b2 = new Book("杨戬", 25, "封神演义出版社", "元始天尊");
        Book b3 = new Book("孙悟空", 30, "封神演义出版社", "元始天尊");
        Book b4 = new Book("姜子牙", 35, "封神演义出版社", "元始天尊");
        Book b5 = new Book("姬发", 40, "封神演义出版社", "元始天尊");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        // 对链表进行排序
        Collections.sort(list, new SortByPrice());
        System.out.println(list);
    }
}
