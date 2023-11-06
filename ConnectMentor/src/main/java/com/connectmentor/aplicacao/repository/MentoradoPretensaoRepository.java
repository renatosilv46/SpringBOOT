package com.connectmentor.aplicacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.connectmentor.aplicacao.entity.MentoradoPretensao;

@Repository
public interface MentoradoPretensaoRepository extends JpaRepository<MentoradoPretensao, Long> {

}
