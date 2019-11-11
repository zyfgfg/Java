package kaoshi2.Test3;
import java.io.*;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) throws IOException {
            File file=new File("player.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            InputStreamReader osw=new InputStreamReader(new FileInputStream(file));
            BufferedReader s=new BufferedReader(osw);
            int  count=0;
            System.out.println();
            System.out.println("输入你要查询的球员");
            Scanner ss = new Scanner(System.in);
            String name = ss.next();
            String sss = s.readLine();
            while (sss != null) {
                if (name.equals(sss.substring(0,sss.indexOf(",")))) {
                    System.out.println("他所在的队伍是     "+sss.substring(sss.indexOf(",")+1));
                    count = 1;
                    break;
                }
                sss = s.readLine();
            }
            if (count == 0) {
                System.out.println("你输入有误");


            }
        }

}
