package com.connectmentor.aplicacao.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Sessoes")
public class Sessoes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idSessao")
private Long idSessao;
@ManyToOne
@JoinColumn(name = "idMentor")
private Mentor mentor;
@ManyToOne
@JoinColumn(name = "idMentorado")
private Mentorado mentorado;
//Constructors
public Sessoes() {
	
}
	public Sessoes(Long idSessao, Mentor mentor, Mentorado mentorado) {
		super();
		this.idSessao = idSessao;
		this.mentor = mentor;
		this.mentorado = mentorado;
	}
	//Getters and Setters
	
	public Long getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(Long idSessao) {
		this.idSessao = idSessao;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public Mentorado getMentorado() {
		return mentorado;
	}
	public void setMentorado(Mentorado mentorado) {
		this.mentorado = mentorado;
	}
}

