package four.ten;
//学生属性有:
//        姓名,年龄,学生编号,班级
public class Student extends Class{
    public String name;
    public String age;
    public String number;
    public String Class;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void setClass(String aClass) {
        Class = Class;
    }

    public Student(String name, String age, String number, String Class) {
        this.name = name;
        this.age = age;
        this.number = number;
        Class = Class;
    }


}
