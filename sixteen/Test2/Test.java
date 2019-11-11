package kaoshi2.Test2;


import java.net.DatagramSocket;
import java.net.SocketException;
/**2.使用TCP网络编程完成用户登录功能：
 * 客户端输入用户名和密码，向服务器发出登录请求；
 * 服务器接收数据并进行判断，如果用户名和密码均是bjsxt，
 * 则登录成功，否则登录失败，返回相应响应信息；
 * 客户端接收响应信息并输出登录结果*/
public class Test {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds=new DatagramSocket();  //发送端的
        DatagramSocket  ds2=new DatagramSocket(1100);  //作为接受段的端口号
        RevicedDemo rs=new RevicedDemo(ds2);
        SendDemo sc=new SendDemo(ds);

        Thread  t1=new Thread(rs);
        Thread t2=new Thread(sc);

        t1.start();
        t2.start();


    }

}


