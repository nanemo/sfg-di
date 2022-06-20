package guru.springframework.sfgid;

import guru.springframework.sfgid.controllers.ConstructorInjectedController;
import guru.springframework.sfgid.controllers.MyController;
import guru.springframework.sfgid.controllers.PropertyInjectedController;
import guru.springframework.sfgid.controllers.SetterInjectedController;
import guru.springframework.sfgid.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDIApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDIApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------------ Primary Bean");

		System.out.println(myController.sayHello());

		System.out.println("------------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}
}
