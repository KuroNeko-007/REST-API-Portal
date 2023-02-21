package com.example.demo.day2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class valueController{
	@Value("${hello.value}")
	private String str;	
	
	@GetMapping("/value")
	public String home() {
		return "Welcome " + str;
	}
}