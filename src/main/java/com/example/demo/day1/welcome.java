package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome{
@GetMapping("/welcome")
public String Welcome() {
	return "Welcome String Boot!";
}
}
