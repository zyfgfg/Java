package third;

import java.util.Scanner;

public class Person {
    private static Object Person;
    public String name;
     public String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String address;
     public String phone;

    public Person(String name, String age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[]args) {
        Person []st=new Person[20];
        Scanner sc=new Scanner(System.in);
        outer:
        for (int i = 0; i < 3; i++) {

            System.out.println("请输入姓名");
        String name =sc.next();
        System.out.println("请输入年龄");
        String age =sc.next();
        System.out.println("请输入地址");
        String address =sc.next();
        System.out.println("请输入手机号");
        String phone =sc.next();
        Person person=new Person(name,age,address,phone);
            st[i]=person;
            System.out.println(st[i].toString());
            for(int j=3;j>=0;j--){
                if(st[j+1].equals(st[j])){
                    st[j]=st[j+1];
                    continue outer;
    }

    System.out.println("输入重复，请重新输入");
    }}
    }
     @Override
     public boolean equals(Object obj){boolean flag=false;
        if(obj==null){
            return false;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        if(this==obj){
            flag=true;
            return flag;
        }
Person per=(Person)obj;
if(this.getAge()==per.getAge()){
            return flag;
        }
if(this.getAddress()==per.getAddress()){
            return flag;
        }if(this.getPhone()==per.getPhone()){
            return flag;
        }
if(this.getName()!=null&&this.getName()!=null){
if(this.getName().equals(per.getName()))
{flag=true;
    return flag;
        }

        }






         return false;
     }
}
