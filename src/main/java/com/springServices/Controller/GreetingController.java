package com.springServices.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	Greeting greeting;
	
	AtomicLong counter= new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name")String name) {
		greeting.setId(counter.incrementAndGet());
		greeting.setContent("Hey i am implementing spring boot "+name);
		return greeting;
		
	}

}
