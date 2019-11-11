package four.eleven;

import java.util.Random;

import java.util.Scanner;

//现有学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）和
//        试题类（试题编号number,试题内容title,试题答案 anwserA  anwserB anwserC anwserD ），
//        其中一个学生（有6个）登录账号进行考试,
//        在控制台随机显示题目,并且输入题目的正确答案才会有分数,每题5分,现在有30个题目(题目自己出,不做要求)。
//        求学生考完试在控制台最终得到的分数
public class Exam extends question {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        question question = new question();
        System.out.println("请输入编号");
        String stuNum = sc.next();
        System.out.println("请输入姓名");
        String stuName = sc.next();
        System.out.println("请输入年级");
        String stuGrade = sc.next();
        int stuScore = 0;
        int score = 0;
        for (int i = 0; i < 10; i++) {

            int num = random.nextInt(10);

            switch (num + 1) {
                case 1:
                    score = question.question_1();
                    break;
                case 2:
                    score = question.question_2();
                    break;
                case 3:
                    score = question.question_3();
                    break;
                case 4:
                    score = question.question_4();
                    break;
                case 5:
                    score = question.question_5();
                    break;
                case 6:
                    score = question.question_6();
                    break;
                case 7:
                    score = question.question_7();
                    break;
                case 8:
                    score = question.question_8();
                    break;
                case 9:
                    score = question.question_9();
                    break;
                case 10:
                    score = question.question_10();
                    break;
                default:break;

            }
            stuScore += score;
        }


        Student st = new Student(stuNum, stuName, stuGrade, stuScore);


        System.out.println(st.toString());
    }
}
