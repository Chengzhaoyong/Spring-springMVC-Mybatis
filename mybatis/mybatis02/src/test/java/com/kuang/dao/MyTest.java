package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    SqlSession session = utilMybatis.getSession();
    userDao mapper = session.getMapper(userDao.class);
    @Test
    public void test(){

     User user = mapper.getUserById(3);
     System.out.println(user);
        session.close();
    }
}
