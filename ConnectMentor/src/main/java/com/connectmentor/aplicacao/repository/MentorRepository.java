package com.connectmentor.aplicacao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectmentor.aplicacao.entity.Mentor;


@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long>{
	
	Optional<Mentor> findByEmail(String email);
	Optional<Mentor> findBySenha(String senha);

}






