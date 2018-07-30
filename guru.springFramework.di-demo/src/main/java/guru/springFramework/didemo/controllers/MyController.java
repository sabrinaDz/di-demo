package guru.springFramework.didemo.controllers;

 
import guru.springFramework.didemo.services.GreetingService;

import org.springframework.stereotype.Controller;



@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	
public MyController(GreetingService greetingService) {
	
		this.greetingService = greetingService;
	}


public String hello(){
	System.out.println("hello, first controller !!!!");
	return greetingService.sayHello();
}
	
}
