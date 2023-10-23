package com.connectmentor.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.connectmentor.aplicacao.controller.MentorController;
import com.connectmentor.aplicacao.service.MentorService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MentorController.class, MentorService.class})
public class ConnectMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMentorApplication.class, args);
	}

}
