package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface userDao {
    List<User> getUser();
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user values(#{id},#{username},#{password})")
    void addUser(Map map);

    @Update("update user set name=#{username}, pwd =#{password} where id=#{id}")
    void updateUser(User user);


    void deleteUser(int id);
    List<User> getUserGuessLike(String value);
}
