package com.connectmentor.aplicacao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.connectmentor.aplicacao.entity.Pretensao;
import com.connectmentor.aplicacao.repository.PretensaoRepository;

@Service
public class PretensaoService {

@Autowired
PretensaoRepository repository;

	
	//Método para recuperar o mentorado pelo id;
			public Pretensao buscarIdPretensao(Long idPretensao) {
				Optional<Pretensao> pretensao = repository.findById(idPretensao);
				return pretensao.orElse(null);
			}
}
