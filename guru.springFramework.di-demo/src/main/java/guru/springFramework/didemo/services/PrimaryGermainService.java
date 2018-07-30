package guru.springFramework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


//@Service
//@Primary
//@Profile("de")
public class PrimaryGermainService implements GreetingService{

	private GreetingRepository greetingRepository;
	
	
	public PrimaryGermainService(GreetingRepository greetingRepository) {
		 
		this.greetingRepository = greetingRepository;
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return  greetingRepository.getGermainGreetingt();
	}

}
