package eight.practise06;

/** 2）定义一个抽象员工类
 属性： 姓名，基本工资
 抽象方法：计算工资。
 *
 */
public abstract class employee {
    public String name; //姓名
    public double pay; //工资
    abstract double count_pay();//抽象方法：计算工资
}

