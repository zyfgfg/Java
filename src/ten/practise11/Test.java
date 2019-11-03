package ten.practise11;

import java.util.ArrayList;
import java.util.List;

/**4.某中学有若干学生(学生对象放在一个List中)，
 * 每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 
 某次考试结束后，每个学生都获得了一个考试成绩。
 遍历list集合，并把学生对象的属性打印出来
 */
public class Test {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Student("张一","三年一班",1342.21));
        list.add(new Student("张二","三年一班",12342.21));
        list.add(new Student("张三","三年二班",1242.21));
        list.add(new Student("张四","三年三班",1342.21));
        list.add(new Student("张五","三年四班",2342.21));
        list.add(new Student("张六","三年三班",1234.21));
        System.out.println(list);
    }
}
