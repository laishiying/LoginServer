package com.hxyl.jason.tool.token;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class DemoTset {


    @RequestMapping("/token")
    public  String test(HttpServletRequest request,HttpSession session){
        String tokenServerkey = "HX0010080";
        TokenTools t = new TokenTools();
        t.createToken(request,tokenServerkey,session);

        if(request.getSession().getAttribute(tokenServerkey)!=null){
            String str  = request.getSession().getAttribute(tokenServerkey).toString();
            System.out.println(str);
            return str;
        }
        return "噢买尬！";

    }
}
