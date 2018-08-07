package com.hxyl.jason.tool.token20180719;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import com.hxyl.jason.entity.WpUser;
import com.hxyl.jason.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class login {


    @Autowired
    public LoginServiceImpl loginServiceImpl;

    @PostMapping("/login1")
    public MSGEntiy login(@RequestParam("name") String name, @RequestParam("pass") String pass, HttpServletResponse response)
            throws ServletException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        MSGEntiy m = new MSGEntiy();
        String token = "";
        if(name==null||pass==null||name==""||pass==""){
            m.tokenid = null;
            m.status = "101";
            m.msg = "缺少必要参数";
            return m ;
        }

        WpUser wp = loginServiceImpl.UserLogin(name,pass);
        if (wp == null) {
            m.tokenid = null;
            m.status = "102";
            m.msg = "用户账号或密码有误";
            return m ;
        }

        token = Jwts.builder().setSubject(name).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "base64EncodedSecretKey").compact();
        m.tokenid = token;
        m.status = "100";
        m.msg = "登陆成功";
        return m;
    }
}
