package kaoshi2.Test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Random;

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

                DatagramPacket dp = new DatagramPacket(by, by.length);
                try {
                    ds.receive(dp);

                } catch (IOException e) {
                    e.printStackTrace();
                }

                String se=new  String(by, 0, dp.getLength());
                if(se.equals("bjsxt")){
                    System.out.println("登录成功");
System.exit(0);
                }



//            System.out.println("内容长度:" + dp.getLength());
//            InetAddress ip = dp.getAddress();
//            by = dp.getData();
//
//
//            System.out.println("地址为:" + ip + "数据为:" + (new String(by, 0, dp.getLength())));

//            String   str=new String(by,0,dp.getLength());



        }

    }
}

