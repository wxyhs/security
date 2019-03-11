package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 15:01 2019/3/11 0011
 */
@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin!";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user!";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba!";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
