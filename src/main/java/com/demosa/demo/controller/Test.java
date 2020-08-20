package com.demosa.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo-sa/test")
public class Test {

    @GetMapping
    public String get(){
        return "<br><br><br><center><h1><b>Hello There! This is my first Demo App in Azure Web Cloud! <br> God Damn! It`s Great! :)</center></b></h1>";
    }
}
