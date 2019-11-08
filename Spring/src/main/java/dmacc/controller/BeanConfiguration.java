package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Movie;
import dmacc.beans.Theater;

@Configuration
public class BeanConfiguration {
	@Bean
	public Theater theater() {
		Theater bean = new Theater("Eric");
		return bean;
	}
	@Bean
	public Movie movie() {
		Movie bean = new Movie("1 Thing st", "Ankeny ", "IA");
		return bean;
	}
}
