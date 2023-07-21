package com.fundacaobradesco.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@ResponseBody

public class HelloController {
		
	@GetMapping
	public String Hello() {
		return "oi mundo em spring";
	}
}
