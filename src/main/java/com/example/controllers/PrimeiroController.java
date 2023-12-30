package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path={"/hello"})
	public String ola() {
		return"Olá Spring Boot!";
	}
	@GetMapping(path={"/"})
	public String oi() {
		return"Oi Spring!";
	}
}
