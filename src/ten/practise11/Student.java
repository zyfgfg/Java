package ten.practise11;
/**4.某中学有若干学生(学生对象放在一个List中)，
 * 每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 
 某次考试结束后，每个学生都获得了一个考试成绩。
 遍历list集合，并把学生对象的属性打印出来
 */
public class Student {
    public String name;
    public String stuname;
    public double scroes;

    public Student(String name, String stuname, double scroes) {
        this.name = name;
        this.stuname = stuname;
        this.scroes = scroes;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public double getScroes() {
        return scroes;
    }

    public void setScroes(double scroes) {
        this.scroes = scroes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuname='" + stuname + '\'' +
                ", scroes=" + scroes +
                '}';
    }
}
