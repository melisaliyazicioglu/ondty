package com.project.yasar.onduty.domain;

public class Credential {

    private long credentialid;
    private long userid;
    private String username;
    private String password;
    boolean usertype;

    public Credential(long credentialid, long userid, String username, String password, boolean usertype) {
        this.credentialid = credentialid;
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public long getCredentialid() {
        return credentialid;
    }

    public void setCredentialid(long credentialid) {
        this.credentialid = credentialid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
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

    public boolean isUsertype() {
        return usertype;
    }

    public void setUsertype(boolean usertype) {
        this.usertype = usertype;
    }
}
