package com.virtusa.SpringRestdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

@GetMapping("/hello")
public String SayHello() {
	return "Hello World!";
}
}

