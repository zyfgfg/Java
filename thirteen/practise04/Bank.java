package thirteen.practise04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

/**1.模范  一个账户 1000块钱 :两个人 A B  分别在柜台和ATM机 取钱  A每次取钱100  B每次取200   最终在控制台输出每个人取钱数
 */
public class Bank  {
    static double money = 1000;

    // 柜台Counter取钱的方法
    private void Counter(double money) {
        Bank.money -= money;
        System.out.println("柜台取钱" + money + "元，还剩" + Bank.money + "元！");
    }

    // ATM取钱的方法
    private void ATM(double money) {
        Bank.money -= money;
        System.out.println("ATM取钱" + money + "元，还剩" + Bank.money + "元！");
    }

    public synchronized void outMoney(double money, String mode) throws Exception {
        if (money > Bank.money) {
            //校验余额是否充足
            throw new Exception("取款金额" + money + ",余额只剩" + Bank.money + "，取款失败");
        }
        if (mode.equals("ATM")) {
            ATM(money);
        } else {
            Counter(money);
        }
    }


}