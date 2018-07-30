package guru.springFramework.didemo.services;

import org.springframework.stereotype.Service;



@Service
public class SetterGreetingService implements GreetingService{

	
	public static final String HELLO_WORLD="hello, setter greeting service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORLD;
	}

	
	
}
