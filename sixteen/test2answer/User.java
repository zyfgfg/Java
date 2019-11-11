package kaoshi2.test2answer;

import java.io.Serializable;

public class User implements Serializable {
    public String Username;
    public String password;

    public User(String username, String userpassword) {
        Username = username;
        password = userpassword;
    }

    public User() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserpassword(String userpassword) {
        password = userpassword;
    }
}
