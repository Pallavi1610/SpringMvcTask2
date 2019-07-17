package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class User {
    String name;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public User(){

    }


    public User(String name,String password) {
        this.name = name;
        this.password=password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
