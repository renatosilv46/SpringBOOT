package com.connectmentor.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConnectMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMentorApplication.class, args);
	
	}

}
