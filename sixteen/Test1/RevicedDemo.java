package kaoshi2.Test1;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.io.IOException;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

/**编程题猜数字小游戏 游戏规则：当客户端第一次连接到服务器端时，
 * 服务器端生成一个[0,50]之间的随机数，然后客户端输入数字来猜该数字。
 * 每次客户端输入数字以后，发送给服务器，服务器判断该客户端发送的数字和随机数字的关系
 * ，并反馈比较结 果（如猜的数字大了或小了）。客户端总共有5次猜的机会，
 * 猜中提示“猜中了”，当客户端输入"quit"时结束 程序。 注意：服务器支持多个客户端同时工作*/

class RevicedDemo implements Runnable {

    private DatagramSocket ds = null;
    static Random random=new Random();
    static int  c=random.nextInt(50);

    public RevicedDemo(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        while (true) {

            //创建接受数据的容器
            byte[] by = new byte[200];

            for (int i = 0; i < 5; i++) {
            DatagramPacket dp = new DatagramPacket(by, by.length);
            try {
                ds.receive(dp);

            } catch (IOException e) {
                e.printStackTrace();
            }

            String se=new  String(by, 0, dp.getLength());
int e=new Integer(se);
            if(e==c){
                System.out.println("猜中了");System.exit(0);

}else if(e>c){
                System.out.println("大了");
            }
else if(e<c){
                System.out.println("小了");
            }
                else if(se.equals("quit")){
                    System.out.println("拜拜 ~ ~");
                    break;
                }
            }
            System.out.println("正确答案是"+c);




        }

    }
}

