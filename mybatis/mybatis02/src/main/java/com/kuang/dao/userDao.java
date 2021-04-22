package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface userDao {
    List<User> getUser();
    User getUserById(int id);
    void addUser(Map map);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getUserGuessLike(String value);
}
