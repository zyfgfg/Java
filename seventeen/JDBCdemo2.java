package seventeen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class JDBCdemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/zhou";
    String drive="com.mysql.jdbc.Driver";
    String username="root";
    String password="banyuan";
    Class.forName(drive);
        Connection connection= DriverManager.getConnection(url,username,password);

    }
}
