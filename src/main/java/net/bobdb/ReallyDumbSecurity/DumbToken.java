package net.bobdb.ReallyDumbSecurity;


import java.time.Instant;

public class DumbToken {
    private String token;
    private Instant instant;

    public DumbToken() {
        this.token = null;
    }

    public DumbToken(String token) {
        this.token = token;
        Instant instant;
    }

    public DumbToken getToken() {
        return this;
    }

}
