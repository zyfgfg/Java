package forth.eight.practise05;
import java.util.Scanner;
// 1) 创建一个老师类:Teacher
//         2) 为老师添加字段:id,name,sex,age,height
//         3) 分别为字段添加对应的属性:
//         id:int，不用校验
//         name:string，长度大于一位少于四位
//         sex:string，只能是男和女
//         age:int，只能在20-55之间
//         height:double，只能在1.50-1.80之间
//         定义一个ShowData方法，打印编号、姓名、性别、身高
//         4） 创建一个老师对象，调用其ShowData();
public class Teacher {
    public int id;
    public String name;
     public String sex;
    public int age;
    public double height;
    Scanner sc=new Scanner(System.in);

    public int getId(){
        System.out.println("请输入Id");
         id=sc.nextInt();
        return id;

    }
public String getName(){
    System.out.println("请输入姓名：");
    name=sc.next();
    if(name.length()>0&&name.length()<4){
        {return name;}
    }
    else
    {System.out.println("输入错误，请重新输入");
    return getName();}
}
public String getsex(){
    System.out.println("请输入性别：");
    sex=sc.next();
    if(sex.equals("男")||sex.equals("女"))
        {return sex;}
    else
    {System.out.println("输入错误，请重新输入");
    return getsex();}
}
public int getage(){
    System.out.println("请输入年龄：");
    age=sc.nextInt();
    if(age>20&&age<55)
        {return age;}
    else
    {System.out.println("输入错误，请重新输入");
    return getage();}
}
public double getHeight(){
    System.out.println("请输入身高：");
    height=sc.nextDouble();
    if(height>1.50&&height<1.80)
    {return height;}
    else
    {System.out.println("输入错误，请重新输入");
    return getHeight();}
}
public void ShowData(){
    System.out.println("Id为"+getId()+"姓名为"+getName()+"性别为"+getage()+"年龄为"+getage()+"身高为"+getHeight());
}

}
