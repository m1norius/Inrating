package com.insta.minorius.insta.response.user_token;

/**
 * Created by Minorius on 08.12.2017.
 */

public class TokenBody {

    private String client_id = "2";
    private String client_secret = "0123456789987654321";
    private String grant_type = "password";
    private String username;
    private String password;

    public TokenBody(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
