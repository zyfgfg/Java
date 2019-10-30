package forth.eleven;
import java.util.Random;

import java.util.Scanner;

//现有学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）和
//        试题类（试题编号number,试题内容title,试题答案 anwserA  anwserB anwserC anwserD ），
//        其中一个学生（有6个）登录账号进行考试,
//        在控制台随机显示题目,并且输入题目的正确答案才会有分数,每题5分,现在有30个题目(题目自己出,不做要求)。
//        求学生考完试在控制台最终得到的分数
public class question {
    public String number;
    public String title;
    public String answerA="a";
    public String answerB="b";
    public String answerC="c";
    public String answerD="d";
    Scanner sc=new Scanner(System.in);
    String answer;
    Random random = new Random();//默认构造方法
    public int question_1(){
        int num = random.nextInt(3);
switch(num+1){
    case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
        answer=sc.next();
        if(answerB.equals(answer)){
            return 5;
        }else
        {
            return 0;
        }
    case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
        answer=sc.next();
        if(answerC.equals(answer)){
            return 5;
        }else
        {
            return 0;
        }
    case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
         answer=sc.next();
        if(answerB.equals(answer)){
            return 5;
        }else
        {
            return 0;
        }
    default:return 0;

    }
    }
    public int question_2(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+9=?\nA:10\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerA.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("2+3=?\nA:5\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerA.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("2+4=?\nA:1\nB:6\nC:6\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}
public int question_3(){
    int num = random.nextInt(3);
    switch(num+1){
        case 1:System.out.println("2+5=?\nA:1\nB:2\nC:7\nD:4");
            answer=sc.next();
            if(answerC.equals(answer)){
                return 5;
            }else
            {
                return 0;
            }
        case 2:System.out.println("2+6=?\nA:1\nB:2\nC:8\nD:4");
            answer=sc.next();
            if(answerC.equals(answer)){
                return 5;
            }else
            {
                return 0;
            }
        case 3:System.out.println("2+7=?\nA:1\nB:9\nC:3\nD:4");
            answer=sc.next();
            if(answerB.equals(answer)){
                return 5;
            }else
            {
                return 0;
            }
        default:return 0;
        }}public int question_4(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("3+3=?\nA:1\nB:2\nC:6\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("3+4=?\nA:1\nB:2\nC:7\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("3+5=?\nA:1\nB:8\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}
    public int question_5(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("3+6=?\nA:1\nB:9\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("3+7=?\nA:1\nB:2\nC:10\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("4+4=?\nA:8\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answer.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}public int question_6(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}public int question_7(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}public int question_8(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}public int question_9(){
        int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}public int question_10(){int num = random.nextInt(3);
        switch(num+1){
            case 1:System.out.println("1+1=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 2:System.out.println("1+2=?\nA:1\nB:2\nC:3\nD:4");
                answer=sc.next();
                if(answerC.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            case 3:System.out.println("1+5=?\nA:1\nB:6\nC:3\nD:4");
                answer=sc.next();
                if(answerB.equals(answer)){
                    return 5;
                }else
                {
                    return 0;
                }
            default:return 0;
        }}



    }




