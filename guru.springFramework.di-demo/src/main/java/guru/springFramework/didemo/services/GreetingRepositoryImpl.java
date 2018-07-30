package guru.springFramework.didemo.services;

import org.springframework.stereotype.Component;


@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	private static final String ENGLISH_GREETING="HELLO, PRIMARY GREETING SERVICE _EN";
	private static final String SPANISH_GREETING="HELLO, PRIMARY GREETING SERVICE _ES";
	private static final String GERMAIN_GREETING="HELLO, PRIMARY GREETING SERVICE _GE";


	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return ENGLISH_GREETING;
	}

	@Override
	public String getSpanishGreeting() {
		// TODO Auto-generated method stub
		return SPANISH_GREETING;
	}

	@Override
	public String getGermainGreetingt() {
		// TODO Auto-generated method stub
		return GERMAIN_GREETING;
	}

}
