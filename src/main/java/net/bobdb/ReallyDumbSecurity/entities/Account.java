package net.bobdb.ReallyDumbSecurity.entities;

public class Account {
    String account;
    public Account() {
        this.account = null;
    }
    public Account(String accountId) {
        this.account = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
