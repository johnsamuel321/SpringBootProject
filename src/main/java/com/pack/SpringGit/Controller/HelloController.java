package com.pack.SpringGit.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
		
	}
}
