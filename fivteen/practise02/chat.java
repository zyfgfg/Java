package fivteen.practise02;


import java.io.IOException;
import java.net.*;
import java.util.Scanner;

    public class chat extends Thread{

        DatagramSocket ds = null;
        DatagramPacket dp = null;

        @Override
        public void run() {

            while (true) {
                try {
                    ds = new DatagramSocket();
                } catch (SocketException e) {
                    e.printStackTrace();
                }

                Scanner sc = new Scanner(System.in);
                System.out.println("说呀");
                String str = sc.next();
                try {
                    dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("192.168.9.110"), 2222);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                try {
                    ds.send(dp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

