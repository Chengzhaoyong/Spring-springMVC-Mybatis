package com.kuang.pojo;

public class UserT {
    private String name;

    public String getName() {
        return name;
    }

    public UserT(){
        System.out.println("好好吃");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserT{" +
                "name='" + name + '\'' +
                '}';
    }
}
