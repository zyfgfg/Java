package seventeen;

import java.sql.*;

/**
 *
 */
public class JDBCdemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/zhou";
        ResultSet rs = null;
        Connection connection = null;
        PreparedStatement statement = null;
//        lib/mysql-connector-java-5.1.20.jar!.com.mysql.jdbc.Driver
        try {
            //1,加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            //此处按照实际的数据库名称和账号密码进行修改
            //格式为jdbc:mysql://127.0.0.1:3306/数据库名称?useSSL=true&characterEncoding=utf-8&user=账号名&password=密码
            connection = DriverManager.getConnection(url,"root","banyuan");
            System.out.println("创建连接成功");
            //3.写sql
            //根据数据库实际的表名写SQL语句
            String sql="select * from boys";
            //4.得到statement对象执行sql
//            ResultSet rs=
            statement = connection.prepareStatement(sql);
            //5.得到结果集
            rs = statement.executeQuery();
            //6.处理结果集

            while(rs.next()){
                System.out.println(rs.getInt(1)+" ");
                System.out.println(rs.getString(2)+" ");
                System.out.println(rs.getString(3)+" ");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.关闭
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("关闭成功");
        }
    }
}


