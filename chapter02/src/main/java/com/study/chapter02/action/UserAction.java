package com.study.chapter02.action;

public class UserAction {
    private String username;
    private String address;
    private String telephone;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String execute(){
        if (username.equals("libuguan") && address.equals("广州")){
            return "success";
        }

        return "error";
    }
}
