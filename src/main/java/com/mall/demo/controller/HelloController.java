package com.mall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloController {
    @RequestMapping("/")
    public String hello(){
        System.out.println("hello1");
        return "TestVue.html";
    }
    @GetMapping("/tests")

        public String test(){
        System.out.println("test Done");
        return "redirect:test1.html";
    }
}
