package com.example.demo.day1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class name{
    private String a;
    public void setName(String a){
        this.a=a;
    }
    @GetMapping("/")
    public String getName(){
        setName("IamNeo!");
        return "Welcome "+a;
    }

}