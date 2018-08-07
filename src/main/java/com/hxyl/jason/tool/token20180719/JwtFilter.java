package com.hxyl.jason.tool.token20180719;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter  implements javax.servlet.Filter{



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }



    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        //解决跨域
        HttpServletResponse httpServletResponse=(HttpServletResponse)res;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Authentication,Origin, X-Requested-With, Content-Type, Accept");
        chain.doFilter(req,httpServletResponse);

        String authHeader = request.getHeader("tokenid");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            chain.doFilter(req, res);
        } else {
            if (authHeader == null) {
                throw new ServletException("不合法的tokenid header");
            }
            // 取得token
            String token = authHeader.substring(0);
            try {
                Claims claims = Jwts.parser().setSigningKey("base64EncodedSecretKey").parseClaimsJws(token).getBody();
                request.setAttribute("claims", claims);
            } catch (Exception e) {
                throw new ServletException("Invalid Token");
            }
            chain.doFilter(req, res);
        }
    }


}
