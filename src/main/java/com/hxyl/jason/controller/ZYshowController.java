package com.hxyl.jason.controller;

import com.hxyl.jason.tool.token.TokenTools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ZYshowController {


    @PostMapping("/zyshow")
    public String zyshow(HttpServletRequest request, @RequestParam(name="tokenid")String tokenid, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        if (tokenid!=null&&request.getSession().getAttribute("9999")!=null){
            String tokenServerkey = request.getSession().getAttribute("9999").toString();
            String tokenClientkey = tokenid;

            TokenTools t = new TokenTools();
            if(t.judgeTokenIsEqual(request,tokenClientkey,tokenServerkey)==true){
                System.out.println("ok");
                return "shouye.html";
            }else {
                System.out.println("no");
                return "index.jsp";
            }

        }

        return "index.jsp";
    }
}
