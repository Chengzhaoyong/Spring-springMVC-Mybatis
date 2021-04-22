package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class MyTest {
    SqlSession session = utilMybatis.getSession();
    userDao mapper = session.getMapper(userDao.class);
    @Test
    public void test(){

     User user = mapper.getUserById(19);
     System.out.println(user);
        session.close();
    }
    @Test
    public void test01(){
        mapper.deleteUser(3);
        session.commit();
        System.out.println("成功了");
        session.close();
    }

   static   Logger logger=Logger.getLogger(MyTest.class);



    @Test
    public void selectUser() {
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");

        List<User> users = mapper.getUser();
        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }

}
