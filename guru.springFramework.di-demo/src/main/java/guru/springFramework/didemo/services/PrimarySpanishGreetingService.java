package guru.springFramework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/*@Service
@Profile("es")
@Primary*/
public class PrimarySpanishGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	
	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		 
		this.greetingRepository = greetingRepository;
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getSpanishGreeting();
	}

}
