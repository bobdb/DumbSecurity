package net.bobdb.ReallyDumbSecurity;


import java.time.Instant;

public class DumbToken {
    private String token;
    private Instant created;

    public DumbToken() {
        this.token = null;
    }

    public DumbToken(String token) {
        this.token = token;
        this.created = Instant.now();
    }

    public DumbToken getToken() {
        return this;
    }

}
