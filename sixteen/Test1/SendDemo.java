package kaoshi2.Test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;

public class SendDemo implements   Runnable {
    private DatagramSocket  ds=null;
static Random random=new Random();
 static int  c=random.nextInt(50);
    public SendDemo(DatagramSocket ds) {
        this.ds=ds;
    }

    @Override
    public void run() {
        while(true){
            Scanner sc=new Scanner(System.in);

            System.out.println("请输入要发送的数据:");
            String  str=sc.next();
             int c=Integer.parseInt(str);

            //地址  端口号
            InetAddress ip= null;
            try {
                ip = InetAddress.getByName("192.168.9.110");
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            int  port=1122;

            DatagramPacket dp=new DatagramPacket(str.getBytes(),str.getBytes().length,ip,port);

            try {
                ds.send(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(str.equals("quit")){
                Thread.currentThread().stop();
                break;
            }
            //  ds.close();
        }

    }
}
