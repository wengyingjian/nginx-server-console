package com.wengyingjian.nginx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wyj on 16/1/11.
 */
@RestController
@RequestMapping("proxy_pass")
public class ProxyPassController {

    @RequestMapping("test_proxy_pass")
    public Object proxyPass() {
        return "proxy pass success";
    }

    @RequestMapping("request_from")
    public Object requestFrom(HttpServletRequest request) {
        return String.format("%s%s%s",request.getRequestURI(),request.getRemoteAddr(),request.getRemoteHost());
    }
}
