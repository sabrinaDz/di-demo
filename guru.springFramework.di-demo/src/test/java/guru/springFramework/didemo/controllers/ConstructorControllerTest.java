package guru.springFramework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springFramework.didemo.services.GreetingService;
import guru.springFramework.didemo.services.GreetingServiceImpl;

public class ConstructorControllerTest {

	
	private ConstructorInjectedController constructorInjectedController;

   @Before
   public void Setup() {
	  GreetingService greetingService=new GreetingServiceImpl();
	  this.constructorInjectedController =new ConstructorInjectedController(greetingService);
	}
	
	
	@Test
	public void testGreeting() throws   Exception{
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD,constructorInjectedController.sayHello());
	}
}
