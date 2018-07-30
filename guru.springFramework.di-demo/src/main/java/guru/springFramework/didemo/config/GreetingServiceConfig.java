package guru.springFramework.didemo.config;

import guru.springFramework.didemo.services.GreetingRepository;
import guru.springFramework.didemo.services.GreetingService;
import guru.springFramework.didemo.services.GreetingServiceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


@Configuration
public class GreetingServiceConfig {

	@Bean
	  GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
		  return new GreetingServiceFactory(greetingRepository);
	  }
	
	
	    @Bean
	    @Primary
	    @Profile({"default", "en"})
	    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
	        return greetingServiceFactory.createGreetingService("en");
	    }

	    @Bean
	    @Primary
	    @Profile("es")
	    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
	        return greetingServiceFactory.createGreetingService("es");
	    }

	    @Bean
	    @Primary
	    @Profile("de")
	    GreetingService primaryGermanService(GreetingServiceFactory greetingServiceFactory){
	        return greetingServiceFactory.createGreetingService("de");
	    }
}
