package com.hxyl.jason.controller;

import com.hxyl.jason.base64.Base64Tset;
import com.hxyl.jason.entity.WpUser;
import com.hxyl.jason.md5.MD5Util;

import com.hxyl.jason.service.impl.LoginServiceImpl;
import com.hxyl.jason.tool.token.TokenTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    public LoginServiceImpl loginServiceImpl;

     String tokenStr=null;

    @PostMapping("/login")
    public WpUser UserLogin(@RequestParam(name="workNumber")String workNumber, @RequestParam(name="userPassword") String userPassword, HttpServletResponse response,HttpServletRequest request,HttpSession session){
        response.addHeader("Access-Control-Allow-Origin", "*");

//        HttpSession session = request.getSession();
        Enumeration<String> attrs = session.getAttributeNames();
        while(attrs.hasMoreElements()){
            String name = attrs.nextElement().toString();
            Object vakue = session.getAttribute(name);
            System.out.println("session"+ name + ":" + vakue);
        }
//        System.out.println(workNumber+"------------"+userPassword);
        Base64Tset base = new Base64Tset();
        workNumber = base.getFromBase64(workNumber);
        userPassword = base.getFromBase64(userPassword);
        WpUser wuser = this.loginServiceImpl.UserLogin(workNumber,userPassword);
        WpUser wu = new WpUser();
        if(workNumber==null||userPassword==null||"".equals(workNumber)||"".equals(userPassword)){
            //账号或密码为空
            wu.setLabel(101);
            wu.setInformation("账号或密码为空");
            return wu;
        }else if(wuser == null){
            //用户不存在
            wu.setLabel(102);
            wu.setInformation("用户不存在");
            return wu;
        }else {
            //登陆成功
            wuser.setLabel(100);
            wuser.setInformation("登陆成功");
            //创建token
            TokenTools t = new TokenTools();
            t.createToken(request,workNumber,session);
            //将token返回到前端
            if(request.getSession().getAttribute(workNumber)!=null){
                String str  = request.getSession().getAttribute(workNumber).toString();
                tokenStr = str;
                System.out.println(workNumber+":登陆："+request.getSession().getAttribute(workNumber));
                wuser.setTokenid(str);
            }

            return wuser;
        }
    }

//注销功能
    @PostMapping("/cancellation")
    public int cancellation(HttpServletRequest request,@RequestParam(name="workNumber")String workNumber,@RequestParam(name="tokenid")String tokenid,HttpServletResponse response,HttpSession session){
        response.addHeader("Access-Control-Allow-Origin", "*");

        TokenTools t = new TokenTools();
        System.out.println("tokenid1："+tokenid);
        System.out.println("tokenid2："+tokenStr);
        if(tokenid!=null&&tokenid.equals(tokenStr)){
//            t.removeToken(request,workNumber);
            tokenStr = null ;
            return 0;//0为清空token成功
        }

        return 1;//1为清空token失败
    }

    @GetMapping("/test")
    public String test(){
        return  "20180724哈哈";
    }
}
