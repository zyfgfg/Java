package fivteen.practise01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket("192.168.11.22",2222);
        OutputStream s=sc.getOutputStream();
        s.write("sdfg".getBytes());
sc.close();
    }
}
