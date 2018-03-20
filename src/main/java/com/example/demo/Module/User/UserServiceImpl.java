package com.example.demo.Module.User;

import com.example.demo.Model.User;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserMapper {

    private final SqlSession sqlSession;

    @Override
    public User getUser(String username) {
        return sqlSession.selectOne("UserMapper.getUser", username);
    }

    @Override
    public List<User> getUserList() {
        return sqlSession.selectList("UserMapper.getUserList");
    }
}
