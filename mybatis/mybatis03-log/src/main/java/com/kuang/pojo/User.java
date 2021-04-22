package com.kuang.pojo;

public class User {
    private int id;  //id
    private String password;   //密码
    private String username;   //姓名
//一定要有可以 要不然属性名和数据库的字段名不一致，也会匹配成功
public User(){

}
//mybatis 按照参数顺序进行复值
    public User(int id,String name,String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
