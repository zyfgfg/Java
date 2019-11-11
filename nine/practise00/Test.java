package nine.practise00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Person 类 属性   身份编号    年龄     姓名  住址   性别
 * 现在有男女不同的N个人   分别住在 地址格式为：苏州xxx区  上海XXX区  南京xxx区  镇江xxx区  常州xxx区
 * 每个地方的人数不限
 * 1.将不同地区的n个人存储到集合中区
 * 2.根据手动输入的城市名称显示所有的该市的人员信息
 * 3.删除集合中指定市指定区的所有成员
 * 4.现在xxx市发布了一条新规定 只要住在该市的 该城市下的所有人员的身份编号后都必须加该市的
 * 拼音
 * 如: 身份编号:9527 -----> 9527shanghai
 */


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Collection con=new ArrayList();
            con.add(new Person("01","12","张一","南京栖霞区","男"));
            con.add(new Person("02","12","张二","南京栖霞区","男"));
            con.add(new Person("03","12","张三","上海栖霞区","男"));
            con.add(new Person("04","12","张四","上海栖霞区","男"));
            con.add(new Person("05","12","张五","苏州栖霞区","男"));
            con.add(new Person("06","12","张六","苏州栖霞区","男"));
            con.add(new Person("07","12","张七","镇江栖霞区","男"));
            con.add(new Person("08","12","张八","镇江栖霞区","男"));
            con.add(new Person("09","12","张九","常州栖霞区","男"));
            con.add(new Person("10","12","张十","常州栖霞区","男"));
            System.out.println("请输入要查看的城市:");
            String  city=sc.next();
            System.out.println(getShowInfo(city,con));
        System.out.println("请输入要删除的指定市");
        String person=sc.next();



        }

        public static  Collection   getShowInfo(String city,Collection con){
            Collection  co=new ArrayList();
            Object[]  obj=con.toArray();
            for (int i = 0; i <con.size(); i++) {
                Person p= (Person)obj[i];
                if(city.equals(p.getAddress().substring(0,2))){
                    co.add(p);
                }
            }

            return co;
        }










    }




