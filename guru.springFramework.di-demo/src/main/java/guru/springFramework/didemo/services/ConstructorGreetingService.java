package guru.springFramework.didemo.services;

import org.springframework.stereotype.Service;


@Service
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello, constructor greeting service";
	}

}
