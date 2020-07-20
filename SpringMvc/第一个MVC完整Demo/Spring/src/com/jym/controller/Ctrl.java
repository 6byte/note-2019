package com.jym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ctrl {
	
	@RequestMapping("hey.action")
	public String welcome() {
		return "index";
	}
}
