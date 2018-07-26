package com.hpit.DataService.Application;


import com.hpit.DataService.Implementation.MessageServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.hpit")
@SpringBootApplication

//@SpringBootApplicationThe annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes
@ComponentScan("com.hpit.DataService")
public class dsSpringBootApplication {

    private static  Logger logger = LoggerFactory.getLogger(dsSpringBootApplication.class);

	public static void main(String[] args) {


		//ApplicationContext applicationContext = SpringApplication.run(dsSpringBootApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(
							 dsSpringBootApplication.class)) {

			MessageServiceImpl emailImpl = applicationContext.getBean(MessageServiceImpl.class);
			boolean bol = emailImpl.SendMEssage("Pandiyan Called you first time");
            logger.info("Message Implementation Instance -> {}",emailImpl);

            emailImpl.SendMEssage("Pandiyan Called you first time again");
            logger.info("Message Implementation Instance -> {}",emailImpl);
//			System.out.println(bol);
//			System.out.println("Message Implementation instance -> " + emailImpl);
//			System.out.println("");

			MessageServiceImpl emailImpl1 = applicationContext.getBean(MessageServiceImpl.class);
			boolean bol1 = emailImpl1.SendMEssage("Pandiyan Called you second time");
            logger.info("Message Implementation Instance -> {}",emailImpl1);
//			System.out.println(bol1);
//			System.out.println("Message Implementation instance -> " + emailImpl1);
//			System.out.println("");

		}


	}
}
