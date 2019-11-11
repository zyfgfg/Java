package twelve.practiase01;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        File file =new  File("/Users/edz/IdeaProjects/src");
        File file1=new File("/Users/edz/IdeaProjects/src/Twelve/practiase01/we.txt");
        File []str=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(dir.exists()){
                    return name.endsWith(".txt")||name.endsWith(".jpg")||name.endsWith(".docx");
                }
                return false;
            }
        });
        for (int i = 0; i < str.length; i++) {


            InputStreamReader in = new InputStreamReader(new FileInputStream(str[i]));
            char[] ch = new char[(int) file.length()];
            in.read(ch);

            OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file1, true));

            os.write(ch);


            os.close();

        }
        }}

