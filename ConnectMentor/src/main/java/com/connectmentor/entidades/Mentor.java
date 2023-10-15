package com.connectmentor.entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mentor")
public class Mentor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private boolean pretensao1;
	private boolean pretensao2;
	
	public Mentor() {
		
	}
	
	public Mentor(Integer id , String nome) {
		
		id = this.id;
		nome = this.nome;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getPretensao1() {
		return pretensao1;
	}

	public void setPretensao1(boolean pretensao1) {
		this.pretensao1 = pretensao1;
	}

	public boolean getPretensao2() {
		return pretensao2;
	}

	public void setPretensao2(boolean pretensao2) {
		this.pretensao2 = pretensao2;
	}
	
	
	
	

	
}
