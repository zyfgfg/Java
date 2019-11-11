package kaoshi2.test2answer;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws Exception
     {
              // 1.创建一个ServerSocket，指定等待端口（1分）
                ServerSocket serverSocket = new ServerSocket(8888);
                // 2.使用ServerSocket接收用户请求（处于监听状态）（1分）
               Socket socket = serverSocket.accept();
                // 3.创建输入流和输出流（0.5分）
              ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
              DataOutputStream dos
                    = new DataOutputStream(socket.getOutputStream());
                // 4.接收用户数据并输出（0.5分）
                User user = (User) ois.readObject();
                System.out.println("我是服务器，收到的信息是：" + user);
                // 5.发送反馈信息（0.5分）
                 boolean flag = false;
                if ("bjsxt".equals(user.getUsername())
                        && "bjsxt".equals(user.getPassword()))
               {
                         flag = true;
                    }
                dos.writeBoolean(flag);
               // 6.关闭流和socket（0.5分）
                ois.close();
                dos.close();
                socket.close();
            }

}
