package com.dawood.orderservice.orderservice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/api")
    public String getApi(){
        return "Hello World Order-Service Api...";
    }


}
