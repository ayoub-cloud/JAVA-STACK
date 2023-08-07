package com.ayoub.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
 @RequestMapping("/")
 public String human() {
	 return "helohelo";
 }

 @RequestMapping("/hello")
 public String hello(@RequestParam(value="name" ) String name) {
			return "hello ....."+name;
 }
}
