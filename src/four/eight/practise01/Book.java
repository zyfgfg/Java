package four.eight.practise01;
//请通过代码封装，实现如下需求：
//        编写一个类Book，代表教材:
//        具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
//        为各属性设置赋值和取值方法
//        具有方法:detail，用来在控制台输出每本教材的名称和页数
//        编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确

public class Book {
    public String title;
    public int pageNum;



public int checkPage(int pageNum){
    if(pageNum<200){
        System.out.println("错误信息");
        }
    return pageNum=200;
}
public  Book(String title,int pageNum){
    this.title=title;
    this.pageNum=pageNum;
}
public void settitle(String title){
    this.title=title;

}
    public Book() {
    }

public String gettitle(){
    return title;
}
public void setpageNum(int pageNum){
    this.pageNum=pageNum;
}
public int getpageNum(){
    return pageNum;
}
    @Override
    public String toString(){ return "person{"+"title="+title+"age="+pageNum;}

public String detail(){
    return "书名"+title+",页数"+pageNum;
    }



}