package guru.springFramework.didemo.controllers;

import static org.junit.Assert.*;
import guru.springFramework.didemo.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before 
	public void Setup() throws Exception{
		this.propertyInjectedController=new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl=new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting()throws Exception{
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD,propertyInjectedController.sayHello());
	}
	
	
}
