package com.kuang;

import com.kuang.dao.userDao;
import com.kuang.pojo.User;
import com.kuang.utils.utilMybatis;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class userDaoTest {

   SqlSession sqlSession= utilMybatis.getSession();
  userDao mapper= sqlSession.getMapper(userDao.class);
    @Test
    public void test01(){
        User user = mapper.queryUserById(1);
        System.out.println(user);
        HashMap map = new HashMap();
        map.put("name","kuangshen");
        map.put("id",3);
        mapper.updateUser(map);
        User user1 = mapper.queryUserById(2);
        System.out.println(user1);
        System.out.println(user1==user);
        sqlSession.close();
    }

    @Test
    public void test02(){
        User user = mapper.queryUserById(1);
        System.out.println(user);

        //手动清除一级缓存
      sqlSession.clearCache();
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);
        System.out.println(user1==user);
        sqlSession.close();
    }

    @Test
    public void test03(){
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();


        SqlSession sqlSession= utilMybatis.getSession();
        userDao mapper= sqlSession.getMapper(userDao.class);
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);


    }
    @Test
    public void Test(){
        SqlSession session = utilMybatis.getSession();
        SqlSession session2 = utilMybatis.getSession();

        userDao mapper = session.getMapper(userDao.class);
        userDao mapper2 = session2.getMapper(userDao.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        session.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);

        session2.close();
    }
}
