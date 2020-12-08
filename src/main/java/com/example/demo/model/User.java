package com.example.demo.model;

public class User {

    private String login;
    private String password;
    private boolean active;
    private int incorrectLoginCounter;

    public User(String login, String password, boolean active, int incorrectLoginCounter) {
        this.setLogin(login);
        this.setPassword(password);
        this.setActive(active);
        this.incorrectLoginCounter=incorrectLoginCounter;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public int getIncorrectLoginCounter() {
        return incorrectLoginCounter;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void resetIncorrectLoginCounter() {
      incorrectLoginCounter=0;
    }
    public void addIncorrectLoginCounter() {
        incorrectLoginCounter+=1;
    }
}
