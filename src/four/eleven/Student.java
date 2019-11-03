package four.eleven;
//现有学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）和
//        试题类（试题编号number,试题内容title,试题答案 anwserA  anwserB anwserC anwserD ），
//        其中一个学生（有6个）登录账号进行考试,
//        在控制台随机显示题目,并且输入题目的正确答案才会有分数,每题5分,现在有30个题目(题目自己出,不做要求)。
//        求学生考完试在控制台最终得到的分数

public class Student {
    public String stuNum;
    public String stuGrade;
    public int stuScore;
    public String stuName;
    public Student(String stuNum,String stuName, String stuGrade, int stuScore) {
        this.stuNum = stuNum;
        this.stuGrade = stuGrade;
        this.stuScore = stuScore;
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "学生" +
                "编号：" + stuNum + '\n' +
                "姓名：" + stuName + '\n' +
                "年级：" + stuGrade + '\n' +
                "成绩：" + stuScore + '\n'
                ;
    }
}
