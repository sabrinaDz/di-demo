package guru.springFramework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	
	public static final String HELLO_WORLD="HELLO, greeting serviceImpl";
	@Override
	public String sayHello(){
		
	
		return  HELLO_WORLD;
	}
}
