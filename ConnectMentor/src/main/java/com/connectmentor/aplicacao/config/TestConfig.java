package com.connectmentor.aplicacao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.connectmentor.aplicacao.repository.MentorRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	MentorRepository mentorRepository;
	
	@Override
	public void run(String... args) throws Exception {

		
		

	}
	

}
