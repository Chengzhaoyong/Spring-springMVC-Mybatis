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

        List<User> user = mapper.getUser();
        for(User user1:user){
            System.out.println(user1);
        }
    }

    //根据id  查询用户
    @Test
    public void getUserById(){
        User user = mapper.getUserById(1);
        System.out.println(user);

    }

    //模糊  查询用户

    @Test
    public void getUserGuessLike(){
        List<User> user = mapper.getUserGuessLike("%程%");
        for(User user1:user){
            System.out.println(user1);
        }

    }

    //增加一个用户
    @Test
    public void addUser(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("idd",29);
        map.put("username","好好");
        map.put("password","1233333");
       mapper.addUser(map);
       //提交事务
     session.commit();
     session.close();
    }

    //修改一个用户
    @Test
    public void updateUser(){
        mapper.updateUser(new User(4,"好好xuexi","2222"));
        session.commit();
        session.close();
    }
//删除一个用户
    @Test
    public void deleteUser(){
        mapper.deleteUser(19);
        session.commit();
        session.close();
    }

}
