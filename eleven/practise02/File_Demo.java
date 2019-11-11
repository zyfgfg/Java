package eleven.practise02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Users/edz/IdeaProjects/src/eleven/practise02/a.txt
/**跳到banner的尾部
 回到标题开始
 练习: 以文件流的方式把指定文件夹中的图片,mp3读取到指定的文件夹中去*/
public class File_Demo {
    public static void main(String[] args) throws IOException {
        {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("/Users/edz/IdeaProjects/src/0.jpg"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("/Users/edz/IdeaProjects/src/eleven/practise02/1.jpg\n"));

            int num=0;
            while((num=bis.read())!=-1){
                bos.write(num);
            }
            bis.close();
            bos.close();
        }

    }






}
