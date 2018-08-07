package com.hxyl.jason.service;

import com.hxyl.jason.entity.WpUser;

import java.util.List;

public interface LoginService {
    WpUser UserLogin(String workNumber, String userPassword);
}
