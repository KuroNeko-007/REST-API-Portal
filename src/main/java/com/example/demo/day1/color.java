package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class color{
    public String getMyFav(){
        return "Green";
    }
    @GetMapping("/")
    public String msg(){
        return "My favorite color is "+getMyFav();
    }
}
