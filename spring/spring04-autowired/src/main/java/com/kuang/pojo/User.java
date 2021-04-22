package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
@Autowired
    private Dog dog;
@Autowired
    private Cat cat;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog getDog() {
        return dog;
    }



    public Cat getCat() {
        return cat;
    }


    public String getName() {
        return name;
    }
public void setName(String name){
        this.name=name;
}


}
