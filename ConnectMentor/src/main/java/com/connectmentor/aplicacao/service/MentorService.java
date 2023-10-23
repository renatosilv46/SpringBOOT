package com.connectmentor.aplicacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepository mentorRepository;
	
	public String insHabMentor(Mentor mentor) {
			this.mentorRepository.save(mentor);
			return "redirect:index";
		}

	public void salvarMentor(Mentor mentor) {
        mentorRepository.save(mentor);
    }
	
}
