package com.dawood.gatewayservice.gatewayservice.Controllers;

import com.dawood.gatewayservice.gatewayservice.Models.DBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
@RefreshScope
public class TestController {

    @Autowired
    private DBSettings dbSettings;

    @Value("${my.greeting: default empty}")
    private String greetingsMessage;

    @GetMapping("/api")
    public String getApi(){
        return "Hello World Gateway-Service Api...";
    }

    @GetMapping("/greetings")
    public String getGreetings() {
        return "Greetings : " + greetingsMessage +
                ", " + dbSettings.getConnection();
    }
}
