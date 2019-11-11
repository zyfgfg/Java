package six.practise06;
/**String  st1="aa,bb,cc";  //根据逗号来截取

        String  st3="aa   bb  cc";//  根据空格来截取

        String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";  //根据 \\ 截取

        得到截取之后的数据*/
public class Jie {
    public static void main(String[] args) {
        String st1 = "aa,bb,cc";
        String  st3="aa   bb    cc";
        String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";
        String[]  strs=st1.split(",");
        String[]  str2=st3.split("   ");
        String[]  str3=st4.split("\\\\");
        for(int i=0,len=strs.length;i<len;i++){
            System.out.println(strs[i].toString());
    }  for(int i=0,len=str2.length;i<len;i++){
            System.out.println(str2[i].toString());
    }
        for(int i=0,len=str3.length;i<len;i++){
            System.out.println(str3[i].toString());
    }
}}
