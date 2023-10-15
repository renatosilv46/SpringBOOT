package com.connectmentor.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectmentor.entidades.Mentor;

@Repository
public interface MentorRepository extends JpaRepository <Mentor, Long>{

}






