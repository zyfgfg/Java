package kaoshi3;

import com.sun.codemodel.internal.JStatement;

import java.sql.*;

/**
 *
 */

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


    String url="jdbc:mysql://localhost:3306/zhou";
    String drive="com.mysql.jdbc.Driver";
    String username="root";
    String password="banyuan";
    Class.forName(drive);
    Connection connection= DriverManager.getConnection(url,username,password);
    String sq="select *from subject";
        PreparedStatement statement=connection.prepareStatement(sq) ;
       ResultSet rs=statement.executeQuery();
       while(rs.next()){
           System.out.println(rs.getInt("id")+" "+rs.getString("work"));
       }

       String wq="select *from subject m,worker n where m.id=n.id";
       statement =connection.prepareStatement(wq);
       ResultSet ws=statement.executeQuery();
       while(ws.next()){

           System.out.println(ws.getInt("id")+" "+ws.getString("work")+" "+ws.getString("name")+" "+ws.getString("experience")+" "+ws.getString("sysytem"));
       }
        createDemo();
}

    private static void createDemo() throws SQLException, ClassNotFoundException {
//        PreparedStatement statement=null;
        String url="jdbc:mysql://localhost:3306/zhou";
        String drive="com.mysql.jdbc.Driver";
        String username="root";
        String password="banyuan";
        Class.forName(drive);
        Connection connection= DriverManager.getConnection(url,username,password);

        String w="insert into subject values(3,'科技园清除计划')";
        PreparedStatement statement=connection.prepareStatement(w);
        int result= statement.executeUpdate(w);
        if(result==1){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        String a="insert into worker values(3,'赵一',null,'初级程序员','1年开发经验',23)";
        String b="insert into worker values(3,'赵二',null,'中级程序员','2年开发经验',22)" ;
        String c="insert into worker values(3,'赵三',null,'高级程序员','3年开发经验',22)" ;
         statement=connection.prepareStatement(a);

        int x= statement.executeUpdate(a);
        statement=connection.prepareStatement(b);

        int y= statement.executeUpdate(b);
        statement=connection.prepareStatement(c);

        int z= statement.executeUpdate(c);
        if(x==1&&y==1&&z==1){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }

    }
}