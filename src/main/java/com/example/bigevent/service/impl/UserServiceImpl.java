package com.example.bigevent.service.impl;

import com.example.bigevent.mapper.UserMapper;
import com.example.bigevent.pojo.User;
import com.example.bigevent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author xi
 * @create 2024/3/3 18:03
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User user =userMapper.findByUserName(username);
        return user;
    }

    @Override
    public void register(String username, String password) {
        //TODO
        //加密

        //添加
        userMapper.add(username,password);
    }

    @Override
    public void update(User user) {
        user.setUpdateTime(LocalDateTime.now());
        userMapper.update(user);
    }
}
