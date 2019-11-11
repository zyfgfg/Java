package eight.practise03;
//3.将字符串中指定部分进行反转。


public class practsie03 {
    public static void main(String[] args) {
        String Str1 ="sgfdhvghsbfdbjkgsbdg";
        System.out.println("原来的："+Str1);
        StringBuffer Str2=new StringBuffer(Str1.substring(2, 12));
        System.out.println("颠倒后的："+Str1.substring(0, 2)+Str2.reverse()+Str1.substring(6));





    }
}
