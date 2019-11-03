package eight.practise06;

/** * 4）子类：销售员工类
 属性：
 销售的总金额
 方法
 1. 设置销售的总金额
 2. 重写计算工资方法：
 基本工资+提成。
 提成的计算：
 当销售额再10000以下时，则提成10%，
 等销售额再10000-100000之间是，则提成15%。
 再100000以上是，提成18%。
 *
 */
public class salesMan extends employee{
    //销售的总金额
    private int sale;
    //1. 设置销售的总金额
    public void setSale(int sale) {
        this.sale = sale;
    }
    //2. 重写计算工资方法
    @Override
    double count_pay() {
        if (this.sale<10000){
            if(sale<0){
                System.out.println("销售额不能小于0");
                return 0;
            }
            return this.pay+this.sale*0.1;
        }else if(this.sale>1000 && this.sale<100000){
            return this.pay+this.sale*0.15;
        }else{
            return this.pay+this.sale*0.18;
        }
    }
}




