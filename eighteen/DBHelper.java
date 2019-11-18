package eighteen;

import java.sql.Connection;
import java.util.Collection;

/**
 *
 */
public class DBHelper {
    public Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
