package com.hxyl.jason.tool.token20180719;

import com.netflix.client.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/success")
    public String success(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        return "恭喜您登录成功";
    }

    @GetMapping("/getEmail")
    public String getEmail() {
        return "xxxx@qq.com";
    }
}
