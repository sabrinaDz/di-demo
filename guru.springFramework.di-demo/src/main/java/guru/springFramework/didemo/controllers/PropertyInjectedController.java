package guru.springFramework.didemo.controllers;

 

import guru.springFramework.didemo.services.GreetingServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



 @Controller
public class PropertyInjectedController {

//le nom de la propriété correspond au nom de l'implémentation du service qu'on veut injecter
@Autowired
public GreetingServiceImpl greetingServiceImpl;


public String sayHello(){
	return greetingServiceImpl.sayHello();
}


 




}
