package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public List<User> selectUser() {
        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        userMapper.addUser(new User(5,"程兆永","12334"));
        userMapper.deleteUser(3);
        return userMapper.selectUser();
    }
}
