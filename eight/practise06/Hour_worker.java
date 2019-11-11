package eight.practise06;

public class Hour_worker extends  employee{/**
 * 3）子类：小时工类
 属性：
 工作的小时，每小时工资。
 方法：
 1. 设置工作的小时
 2. 设置每小时的工资。
 3. 重写计算工资方法：
 小时工没有基本工资，他的工资就是工作的小时*每小时工资。
 *
 *
 */
    //工作的小时
    private int time_hour;
    //每小时工资
    private double pay_hour;
    //1. 设置工作的小时
    public void setTime_hour(int time_hour) {
        this.time_hour = time_hour;
    }
    //2. 设置每小时的工资
    public void setPay_hour(int pay_hour) {
        this.pay_hour = pay_hour;
    }
    //3. 重写计算工资方法：
    @Override
    double count_pay() {
        return time_hour*pay_hour;
    }
}
