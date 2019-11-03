package nine.practise01;
/**现在有学生类和学科类   学生类属性: 学生编号  学生姓名，学科类的属性:学科编号   学科名   学科成绩

        规定如下:   学科有 语文  数学  英语  物理 化学

        现在有n个学生，每个学生的每个学科都有成绩

        a.现在要显示所有学生的所有的学科信息

        b.根据每个学生的总成绩和进行降序排序

        c.找出数学成绩前五的人的所有人信息和学科信息

        d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分*/


public class Student {
    public String num;
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                '}';
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

    public Student() {
    }

    public Student(String num, String name) {
        this.num = num;
        this.name = name;
    }
}
