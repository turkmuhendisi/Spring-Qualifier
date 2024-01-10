package com.turkmuhendisi.depi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class DepiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepiApplication.class, args);
	}

	@Bean
	public SecondClass getSecondClass() {
		return new SecondClass();
	}

	@Bean("WORD")
	@Primary
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}

}
