package ua.rd.bean;

public class AuthBean {
    private String authenticated;

    public AuthBean(String authenticated) {
        this.authenticated = authenticated;
    }

    public String isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(String authenticated) {
        authenticated = authenticated;
    }
}
