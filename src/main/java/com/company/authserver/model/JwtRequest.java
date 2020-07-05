package com.company.authserver.model;

public class JwtRequest {
    private String email;
    private String pass;

    public JwtRequest() {
    }

    public JwtRequest(String email, String pass) {
        this.setEmail(email);
        this.setPass(pass);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}