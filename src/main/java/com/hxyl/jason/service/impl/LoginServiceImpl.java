package com.hxyl.jason.service.impl;

import com.hxyl.jason.entity.WpUser;
import com.hxyl.jason.mapper.IUserMapper;
import com.hxyl.jason.mapper.LoginMapper;
import com.hxyl.jason.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    public LoginMapper loginMapper;


    @Override
    public WpUser UserLogin(String workNumber, String userPassword) {
        return loginMapper.UserLogin(workNumber,userPassword);
    }
}
