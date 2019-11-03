package three;

public class Student {
private String name;
private int age;
private String address;


public String getname(){
    return name;
}
public void setName(String name){
    this.name=name;
}
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

public int getAge(){
    return age;
}
public void setage(String age){
    this.name=age;
}
public String getAddress (){
    return name;
}
public void setAddress(String address){
    this.name=address;
}
@Override
    public String toString(){
    return "person{"+"name="+name+"age="+age+"address="+address+"}";
}


}
