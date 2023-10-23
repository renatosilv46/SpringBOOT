package com.connectmentor.aplicacao.entity;

import java.io.Serializable;
import java.util.Date;

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
	private Integer idMentor;
	private String nome;
	private String cpf;
	private Integer genero;
	private Date datanasc;
	private String senha;
	private String email;
	private String telefone;
	private String biografia;
	private byte[] certificado;
	private byte[] foto;
	
	
	
	public Mentor() {
		
	}



	public Integer getIdMentor() {
		return idMentor;
	}



	public void setIdMentor(Integer idMentor) {
		this.idMentor = idMentor;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public Integer getGenero() {
		return genero;
	}



	public void setGenero(Integer genero) {
		this.genero = genero;
	}



	public Date getDatanasc() {
		return datanasc;
	}



	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getBiografia() {
		return biografia;
	}



	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}



	public byte[] getCertificado() {
		return certificado;
	}



	public void setCertificado(byte[] certificado) {
		this.certificado = certificado;
	}



	public byte[] getFoto() {
		return foto;
	}



	public void setFoto(byte[] foto) {
		this.foto = foto;
	}



	
	
	
	
	

	
}
