package com.connectmentor.aplicacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectmentor.aplicacao.entity.MentoradoPretensao;
import com.connectmentor.aplicacao.repository.MentoradoPretensaoRepository;

@Service
public class MentoradoPretensaoService {
	
	//Injeção de dependências;
	@Autowired
	MentoradoPretensaoRepository repository;
	

	
	//Método para salvar pretensoes dos mentorados;
	public void salvarPretensao(MentoradoPretensao mentorado) {
		repository.save(mentorado);
	}
	
	//Método para buscar as pretensões do mentorado;
	public List<MentoradoPretensao> findAll(){
		return repository.findAll();
	}
	
	
	
}
