package guru.springFramework.didemo.controllers;

import guru.springFramework.didemo.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

 

@Controller
public class ConstructorInjectedController {

	
private GreetingService greetingService;
	
	
//autowired automatically
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
	
	this.greetingService = greetingService;
}



	public String sayHello(){
		return greetingService.sayHello();
	}


	 
}
