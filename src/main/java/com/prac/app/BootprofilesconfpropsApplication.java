package com.prac.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.prac")
public class BootprofilesconfpropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootprofilesconfpropsApplication.class, args);
	}

}
