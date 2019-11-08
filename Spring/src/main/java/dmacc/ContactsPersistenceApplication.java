package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Movie;
import dmacc.beans.Theater;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.TheaterRepository;
// Samuel Winslow
// Java 2 Week 10
// 10/30/2019
@SpringBootApplication
public class ContactsPersistenceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContactsPersistenceApplication.class, args);
	}
	
	@Autowired
	TheaterRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	}

}
