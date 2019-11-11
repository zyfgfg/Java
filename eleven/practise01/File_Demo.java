package eleven.practise01;

import java.io.*;

public class File_Demo {
    public static void main(String[] args) {
        File file=new File("src/a.txt");
        InputStream is=null;
        OutputStream os=null;
        String str="你妈屄";
        try{
            is=new FileInputStream(file);
            int line =is.read();
            byte []by=new byte[(int)file.length()];
            int count=0;
            while (line!=-1){
                by[count]=(byte)line;
                count++;
                line=is.read();
            }
            os=new FileOutputStream(file);
            os.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(os!=null){
                    os.close();
                } if(is!=null){
                    is.close();
                }
            }catch(IOException e){
                e.printStackTrace();

            }finally{

            }
        }





    }
}
