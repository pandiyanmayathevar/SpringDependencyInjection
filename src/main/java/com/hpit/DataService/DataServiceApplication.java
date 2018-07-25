package com.hpit.DataService;


import com.hpit.DataService.Service.MessageServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DataServiceApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(DataServiceApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(
							 DataServiceApplication.class)) {

			MessageServiceImpl emailImpl = applicationContext.getBean(MessageServiceImpl.class);
			boolean bol = emailImpl.SendMEssage("Pandiyan Called you first time");
			System.out.println(bol);
			System.out.println("Message Implementation instance -> " + emailImpl);


			MessageServiceImpl emailImpl1 = applicationContext.getBean(MessageServiceImpl.class);
			boolean bol1 = emailImpl1.SendMEssage("Pandiyan Called you second time");
			System.out.println(bol1);
			System.out.println("Message Implementation instance -> " + emailImpl1);

		}


	}
}
