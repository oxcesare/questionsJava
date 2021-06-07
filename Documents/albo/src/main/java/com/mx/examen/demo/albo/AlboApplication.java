package com.mx.examen.demo.albo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlboApplication extends SpringBootServletInitializer implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(AlboApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AlboApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("EXAMEN DE ALBO");
	}

	
	
	
	
	
	

}
