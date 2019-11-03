package eight.practise04;
/**
4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        “To be or not to be"，将变成"oT eb ro ton ot eb."。

*/

public class reverse {
    public static void main(String[] args) {
String st=new String("To be or not to be");
String[]str=st.split(" ");
        for(String s:str){
            StringBuilder builder = new StringBuilder();
            System.out.print(builder.append(s).reverse()+ " ");
        }

    }
}
