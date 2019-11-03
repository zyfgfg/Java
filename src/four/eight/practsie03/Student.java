package four.eight.practsie03;
// 1) 创建一个学生类
//         2) 创建四个私有的字段:name,sex,age,dire
//         3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,age 1-60,dire方向只能是.net或java
//         4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息
public class Student {
 private String name;
 private String sex;
 private int age;
 private String dire;
 public Student(String name,String sex,int age,String dire) {
  this.name=name;
  this.sex=sex;
  this.age=age;
  this.dire=dire;
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


 public String getDire() {
  return dire;
 }


 public void setDire(String dire) {
  this.dire = dire;
 }



  }




















