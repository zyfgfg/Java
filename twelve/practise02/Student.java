package twelve.practise02;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student> {
    private String num;
    private String name;
    private String password;
    private int age ;
    private String clas ;

    public Student(String  num, String name, String password, int age, String clas) {
        this.num = num;
        this.name = name;
        this.password = password;
        this.age = age;
        this.clas = clas;
    }

    public Student() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", clas='" + clas + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
    }
}
