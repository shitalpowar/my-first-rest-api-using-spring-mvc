package com.xyz.myfirstrestapiusingspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    public @ResponseBody String hello(){
        return "...hello...";
    }
}
