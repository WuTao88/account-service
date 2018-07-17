package com.example.cloud.service.accountservice.controller;

import com.example.cloud.service.accountservice.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountServiceController {

    @Autowired
    private accountService service;

    @RequestMapping("/account-login")
    public String login(@RequestParam("name") String name,@RequestParam("pass")String pass){

        return service.login_service(name,pass);
    }
    @RequestMapping("/account-register")
    public String register(@RequestParam("name") String name,@RequestParam("pass")String pass){
        return service.reg_service(name,pass);
    }
}
