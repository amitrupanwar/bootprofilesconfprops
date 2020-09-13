package com.prac.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.prac.model.Item;

@Configuration
public class AppConfig {

	@Bean
	@ConfigurationProperties("item")
	public Item item() {
		return new Item();
	}

	@Bean
	@Profile("dev")
	public Item devItem() {
		System.out.println("Dev profile loaded");
		System.out.println("This is Dev Item");
		return new Item();
	}

	@Bean
	@Profile("test")
	public Item testItem() {
		System.out.println("Test profile loaded");
		System.out.println("This is Test Item");
		return new Item();
	}

	@Bean
	@Profile("prod")
	public Item prodItem() {
		System.out.println("Prod profile loaded");
		System.out.println("This is Prod Item");
		return new Item();
	}
}
