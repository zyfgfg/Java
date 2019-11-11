package kaoshi2.Test1;

import Project.RevicedServer;
import Project.SendClient;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Test {
    public static void main(String[] args) throws SocketException {
        DatagramSocket  ds=new DatagramSocket();  //发送端的
        DatagramSocket  ds2=new DatagramSocket(1122);  //作为接受段的端口号

        RevicedDemo  rs=new RevicedDemo(ds2);
        SendDemo  sc=new SendDemo(ds);

        Thread  t1=new Thread(rs);
        Thread t2=new Thread(sc);

        t1.start();
        t2.start();


    }

}
