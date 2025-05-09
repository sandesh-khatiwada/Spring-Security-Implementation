package com.example.springSecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("")
    public String greet(Authentication authentication){
        return "Welcome "+authentication.getName();
    }



    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @GetMapping("/api/user")
    public String protectedForuser(){
        return "User only";
    }


    @GetMapping("/api/admin")
    public String protectedForAdmin(){
        return "Admin only";
    }
}
