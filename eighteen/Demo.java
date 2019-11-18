package eighteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 */
public class Demo {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/zhou";
        String drive="com.mysql.jdbc.Driver";
        String username="root";
        String password="banyuan";
        Class.forName(drive);
        Connection connection= DriverManager.getConnection(url,username,password);
//        DBHelper db=new DBHelper();
//        Connection con=db.getCon();
        String sql="insert into worker（id,marry,sysytem,experience,age） values( ?,?,?,?,?,?)";
        PreparedStatement pstmt=connection.prepareStatement(sql);
        for(  int i=1;i<100000;i++){
            pstmt.setInt( 1,i);
            pstmt.setString(2, "a"+i);
            pstmt.setString(3, "a"+i);
            pstmt.setString(4, "a"+i);
            pstmt.setString(5, "a"+i);
            pstmt.setInt(6, i);
            pstmt.addBatch();//添加一次预定义参数
//            if(   i%1000==0){
//                int [] r=pstmt.executeBatch();   //批量执行预定义SQL  这个返回值里面存的是每条语句执行的结果.
//            }
        }
        pstmt.close();
//        con.close();
    }}
