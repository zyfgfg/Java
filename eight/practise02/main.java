package eight.practise02;

/**
 * 2.定义一个StringBuffer类对象，
 * <p>
 * 1）使用append方法向对象中添加26个字母，并倒序遍历输入
 * <p>
 * 2）删除前五个字符
 */


public class main {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        Character a = 'a';
        for (int i = 0; i < 25; i++) {
            buf.append(a);
            a = new Character((char) (a + 1));
        }
        buf.append(a);
        System.out.println("添加之后：" + buf);
        buf.reverse();
        System.out.println("翻转之后：" + buf);
        buf.delete(0, 5);
        System.out.println("删除之后：" + buf);
    }
}

