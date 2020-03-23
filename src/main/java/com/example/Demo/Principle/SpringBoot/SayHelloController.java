package com.example.Demo.Principle.SpringBoot;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

	@GetMapping("/sayHello")
	public String sayHello(Principal principal) {		
		return principal.getName();
	}

}
