package com.connectmentor.aplicacao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectmentor.aplicacao.entity.Mentorado;
import com.connectmentor.aplicacao.repository.MentoradoRepository;

@Service
public class MentoradoService {

	@Autowired
	MentoradoRepository repository;
	
	
	
	
	//Método para recuperar o mentorado pelo id;
		public Mentorado buscarIdMentorado(Long idMentorado) {
			Optional<Mentorado> mentorado = repository.findById(idMentorado);
			return mentorado.orElse(null);
		}
		
		public void salvarMentorado(Mentorado mentorado) {
	        repository.save(mentorado);
	    }
}
