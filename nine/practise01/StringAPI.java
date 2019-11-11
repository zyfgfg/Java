package nine.practise01;

import java.util.*;

/**
 * 现在有学生类和学科类   学生类属性: 学生编号  学生姓名，学科类的属性:学科编号   学科名   学科成绩
 * <p>
 * 规定如下:   学科有 语文  数学  英语  物理 化学
 * <p>
 * 现在有n个学生，每个学生的每个学科都有成绩
 * <p>
 * a.现在要显示所有学生的所有的学科信息
 * <p>
 * b.根据每个学生的总成绩和进行降序排序
 * <p>
 * c.找出数学成绩前3的人的所有人信息和学科信息
 * <p>
 * d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分
 */

public class StringAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Subject> con = new ArrayList<>();
        Collection<Subject> con1 = new ArrayList<>();
        Collection<Subject> con2 = new ArrayList<>();
        Collection<Subject> con3 = new ArrayList<>();
        con.add(new Subject("01", "语文", 23));
        con.add(new Subject("02", "数学", 25));
        con.add(new Subject("03", "英语", 73));
        con.add(new Subject("04", "物理", 63));
        con.add(new Subject("05", "化学", 73));
        Student stu = new Student();
        stu.setNum("102");
        stu.setName("张一");
        stu.setCon(con);
        con1.add(new Subject("01", "语文", 23));
        con1.add(new Subject("02", "数学", 85));
        con1.add(new Subject("03", "英语", 93));
        con1.add(new Subject("04", "物理", 43));
        con1.add(new Subject("05", "化学", 23));
        Student stu1 = new Student();
        stu1.setNum("101");
        stu1.setName("张二");
        stu1.setCon(con);
        con2.add(new Subject("01", "语文", 53));
        con2.add(new Subject("02", "数学", 65));
        con2.add(new Subject("03", "英语", 83));
        con2.add(new Subject("04", "物理", 93));
        con2.add(new Subject("05", "化学", 13));
        Student stu2 = new Student();
        stu2.setNum("1033");
        stu2.setName("张三");
        stu2.setCon(con);
        con3.add(new Subject("01", "语文", 53));
        con3.add(new Subject("02", "数学", 65));
        con3.add(new Subject("03", "英语", 83));
        con3.add(new Subject("04", "物理", 93));
        con3.add(new Subject("05", "化学", 13));
        Student stu3 = new Student();
        stu3.setNum("1033");
        stu3.setName("张四");
        stu3.setCon(con);
        List list=new ArrayList();
        list.add(con);
        list.add(con1);
        list.add(con2);
        list.add(con3);
        int i=0;
        int []sum=new int[list.size()];
        for(Object d:list){
            System.out.println(d);
            for(Subject c:(List<Subject>)d){
                sum[i++]+=c.getScore();
            }
        }
        for (int j = 1; j <sum.length ; j++) {
            for (int k = 0; k < sum.length-j; k++) {if(sum[k]>sum[k+1]){
                int temp=sum[k];
                sum[k]=sum[k+1];
                sum[k+1]=temp;
            }
            }
            for(Object o:list){
                System.out.println(o);
            }

        }

    }

}



