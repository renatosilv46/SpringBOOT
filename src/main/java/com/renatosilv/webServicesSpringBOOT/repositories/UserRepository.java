package com.renatosilv.webServicesSpringBOOT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatosilv.webServicesSpringBOOT.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
