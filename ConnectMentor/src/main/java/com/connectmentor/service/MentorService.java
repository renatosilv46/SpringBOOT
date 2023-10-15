package com.connectmentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectmentor.entidades.Mentor;
import com.connectmentor.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepository mentorRepository;
	
public String insHabMentor(Mentor mentor) {
		
    	mentorRepository.save(mentor);
    	
    	return "redirect:index";
			
	}
	
	
	
	
	
	
	
	

}
