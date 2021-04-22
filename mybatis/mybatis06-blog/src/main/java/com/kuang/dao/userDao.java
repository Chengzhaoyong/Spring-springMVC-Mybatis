package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface userDao {
    //根据id查询用户
    User queryUserById(@Param("id") int id);

    //修改用户
    int updateUser(Map map);
}
