package four.nine.practise01;
//定义一个学生类Student，包括 ID、name、sex、age等成员变量；
//        要求有构造方法并有构造方法的重载，
//        有相关成员方法来设置及获取其成员变量的值用输出成员信息的成员方法。
//        并创建一个测试类，
//        用不同的构造方法创建2个Student类的对象，
//        调用相关的方法设置对象的成员变量值，
//        并输出相关信息
public class Student {
    private int ID;
    private String name;
    private String sex;
    private int age;


    public Student(int ID, String name, String sex, int age) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getID(int i) {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
