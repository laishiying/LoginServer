package com.hxyl.jason.haoge;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
public class Demo {

    @RequestMapping("/hi")
    public void hi(HttpServletRequest request) throws IOException {

        System.out.println("Howell word");
        System.out.println("Authorization:"+request.getHeader("Authorization"));
        System.out.println("Cookie:"+request.getHeader("Cookie"));
        System.out.println("User-Agent:"+request.getHeader("User-Agent"));
        System.out.println("Content-type:"+request.getHeader("Content-type"));
        System.out.println("SessionId:"+request.getHeader("SessionId"));
        System.out.println("appid:"+request.getHeader("appid"));
        BufferedReader br = request.getReader();
        String line = null;
        StringBuffer content = new StringBuffer("");
        while( (line = br.readLine()) != null) {
            //line = new String(line.getBytes(), "utf-8");
            content.append(line);
        }
            System.out.println("jsonObj3:"+ content.toString() );

    }

}
