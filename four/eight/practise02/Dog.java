package four.eight.practise02;
//创建一个狗类:Dog
//为Dog添加yao(咬)方法,实现狗咬的功能
//如果是yao(),什么都不传，则是“汪汪叫”
//如果是yao(String str),则是“咬骨头，好香啊”
//如果是yao(Person p),传入的是人类，如果人的性别为男，则“扑上去撕咬”，如果人的性别是女
public class Dog {
    public String str;
    public String p;
    public static void yao(){
        System.out.println("汪汪叫");
    }
public static void yao_1(String str){
        System.out.println("咬骨头，好香啊");
    }
public static void yao(String p){
        if(p.equals("男")){
            System.out.println("扑上去撕咬");
        }
        if(p.equals("女"))
            System.out.println("跑过去舔两口");
        }



}
