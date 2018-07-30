package guru.springFramework.didemo.controllers;

import static org.junit.Assert.assertEquals;
 
import guru.springFramework.didemo.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

public class SetterControllerTest {

	
	
private SetterInjectedController setterInjectedController;
	
	@Before 
	public void Setup() throws Exception{
		this.setterInjectedController=new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting()throws Exception{
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD,setterInjectedController.sayHello());
	}
}
