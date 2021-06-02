package net.bobdb.ReallyDumbSecurity;

public class DumbToken {
    String token;
    public DumbToken() {
        this.token = null;
    }
    public DumbToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
