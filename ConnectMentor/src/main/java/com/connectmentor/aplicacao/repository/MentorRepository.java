package com.connectmentor.aplicacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectmentor.aplicacao.entity.Mentor;


@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long>{

}






