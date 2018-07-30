package guru.springFramework.didemo;

import guru.springFramework.didemo.controllers.ConstructorInjectedController;
import guru.springFramework.didemo.controllers.MyController;
import guru.springFramework.didemo.controllers.PropertyInjectedController;
import guru.springFramework.didemo.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"guru.services","guru.springFramework.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DiDemoApplication.class, args);
		
		MyController myController=(MyController)context.getBean("myController");
		System.out.println(myController.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

	}
}
