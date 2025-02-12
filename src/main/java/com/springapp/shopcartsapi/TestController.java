package com.springapp.shopcartsapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home(){
        return "home here";
    }
}
