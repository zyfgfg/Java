package nine.practise00;
/**
Person 类 属性   身份编号    年龄     姓名  住址   性别
        现在有男女不同的N个人   分别住在 地址格式为：苏州xxx区  上海XXX区  南京xxx区  镇江xxx区  常州xxx区
        每个地方的人数不限
        1.将不同地区的n个人存储到集合中区
        2.根据手动输入的城市名称显示所有的该市的人员信息
        3.删除集合中指定市指定区的所有成员
        4.现在xxx市发布了一条新规定 只要住在该市的 该城市下的所有人员的身份编号后都必须加该市的
        拼音
        如: 身份编号:9527 -----> 9527shanghai

*/


public class Person {
     public String num;
     public String age;
     public String name;
     public String address;
     public String sex;

    public Person() {
    }

    public Person(String num, String age, String name, String address, String sex) {
        this.num = num;
        this.age = age;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num='" + num + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
