package com.mall.demo.controller;

import com.mall.demo.model.Vendor;
import com.mall.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class HelloController {
    @Autowired private HelloService helloService;

    @RequestMapping("/tests")
        public String test() {
        System.out.println("test Done");

        return "redirect:/test1.html";
    }
    @RequestMapping("/vendors")
    public List<Vendor> getVendors(){
        System.out.println(helloService.getVendors());
       return helloService.getVendors();
    }
    @RequestMapping(value = "/testInput")
    public String inputtest(@RequestBody Map s){

       helloService.insertValue(s.get("testdata"));

        return "ok";
    }

}
