package com.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.config.ConfigProps;
import com.prac.model.Item;

@RestController
public class AppController {
	@Autowired
	ConfigProps props;
	@Autowired
	Item item;
	@Value("${message.welcome}")
	private String welcomeMessage;

	@GetMapping("props")
	public ConfigProps props() {
		return props;
	}

	@GetMapping("item")
	public Item item() {
		return item;
	}

	@GetMapping("welcome")
	public String welcome() {
		return welcomeMessage;
	}

}
