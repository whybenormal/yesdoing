package com.yesdoing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeContoller {
	@GetMapping("")
	public String index() {
		return "index";
	}
}
