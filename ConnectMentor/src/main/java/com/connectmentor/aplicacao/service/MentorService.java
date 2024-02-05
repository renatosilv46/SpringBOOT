package com.connectmentor.aplicacao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.entity.Mentorado;
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
	
	public Mentor buscarIdMentor(Long idMentor) {
		Optional<Mentor> mentor = mentorRepository.findById(idMentor);
		return mentor.orElse(null);
	}
	
	public Mentor buscarPorEmail(String email) {
	    Optional<Mentor> mentor = mentorRepository.findByEmail(email);
	    return mentor.orElse(null);
	}
	
	public Mentor buscarPorSenha(String senha) {
	    Optional<Mentor> mentor = mentorRepository.findBySenha(senha);
	    return mentor.orElse(null);
	}
	
	
}
