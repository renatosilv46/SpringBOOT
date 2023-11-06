package com.connectmentor.aplicacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectmentor.aplicacao.entity.Pretensao;

@Repository
public interface PretensaoRepository extends JpaRepository<Pretensao, Long>{

}
