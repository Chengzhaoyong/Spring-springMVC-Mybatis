package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSession sqlSession;

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        return sqlSession.getMapper(UserMapper.class).selectUser();
    }
}
