package com.connectmentor.aplicacao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectmentor.aplicacao.entity.Mentorado;

@Repository
public interface MentoradoRepository extends JpaRepository<Mentorado, Long> {

	Optional<Mentorado> findByEmail(String email);
	Optional<Mentorado> findBySenha(String senha);

	
}
