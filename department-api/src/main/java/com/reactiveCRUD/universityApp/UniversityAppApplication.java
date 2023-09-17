package com.reactiveCRUD.universityApp;

import java.net.InetAddress;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class UniversityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityAppApplication.class, args);
		Logger log=Logger.getLogger("This is spring boot");
		log.info("this is my sample application");
		
		
		
	}

}

