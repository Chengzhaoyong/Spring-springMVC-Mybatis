package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class MyTest {
    SqlSession session = utilMybatis.getSession();
    userDao mapper = session.getMapper(userDao.class);
    @Test
    public void test(){

     User user = mapper.getUserById(1);
     System.out.println(user);
        session.close();
    }

    //测试add
    @Test
    public void add(){
        Map map=new HashMap<String,Object>();
        map.put("id",4);
        map.put("username","周锦彬");
        map.put("password","123321");
        mapper.addUser(map);
    }

    //测试update
    @Test
    public void update(){
        mapper.updateUser(new User(4,"王海煜","123456"));

    }




}
