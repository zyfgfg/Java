package eight.practise06;
/** 1）制作一个销售首饰的公司类。
        属性:
        一个保存员工的数组。
        方法：
        1, 添加一个员工。
        2, 通过员工的名字来删除员工。
        3, 通过员工的名字来显示员工的工资。
        4, 输出所有员工的工资和。
        *
        */
public class company {

    //一个保存员工的数组。
    private employee all_emp[]=new employee[20];
    //1, 添加一个员工。
    public void add_emp(employee emp){
        for (int i=0;i<20;i++){
            if (this.all_emp[i]==null){
                this.all_emp[i]=emp;
            }else{
                System.out.println("公司满员了！");
            }
        }
    }
    //2, 通过员工的名字来删除员工。
    public boolean del_emp(String name){
        for (int i=0;i<20;i++){
            if (this.all_emp[i].name==name){
                this.all_emp[i]=null;
                return true;
            }else{
                System.out.println("查无此人！");
                return false;
            }
        }
        return false;
    }
    //3, 通过员工的名字来显示员工的工资。
    public void show_pay(String name){
        for (int i=0;i<20;i++){
            if (this.all_emp[i].name==name){
                System.out.println(this.all_emp[i].count_pay());
            }else{
                System.out.println("查无此人！");
            }
        }
    }
    //4, 输出所有员工的工资和。
    public void show_paysum(){
        double temp=0;
        for (int i=0;i<20;i++){
            if (this.all_emp[i]!=null){
                temp=+this.all_emp[i].count_pay();
            }
        }
        System.out.println("所有员工的工资和为："+temp);
    }
}

