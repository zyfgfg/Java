package sixth.practise03;
/**
2.以下一段话：
        这些年一个人，风也过，雨也过,有过泪,有过错，
        还记得坚持什么，真爱过才会懂，会寂寞会回首，
        终有梦终有你在心中。统计 过 出线的次数
*/


public class Friend {
    public static void main(String[] args) {
String str="这些年一个人，风也过，雨也过,有过泪,有过错，" +
        "        还记得坚持什么，真爱过才会懂，会寂寞会回首，" +
        "        终有梦终有你在心中。";
int i=0, beginIndex=0;
        String s="过";
         i=new Friend().count(str,s);
        System.out.println(s+"共出现了"+i+"次。");


    }



/**
 * @param str 原字符串
 * @param sToFind 需要查找的字符串
 * @return 返回在原字符串中sToFind出现的次数
 */
private int count(String str,String sToFind) {
        int num = 0;
        while (str.contains(sToFind)) {
        str = str.substring(str.indexOf(sToFind) + sToFind.length());
        num ++;
        }
        return num;
        }}

