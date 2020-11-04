package com.example.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopTest {

    @RequestMapping("/test")
    public String aop(){

        System.out.println("hello word");
        return "hello";
    }
}
