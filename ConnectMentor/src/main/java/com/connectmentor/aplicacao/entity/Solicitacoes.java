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
@Table(name = "Solicitacoes")
public class Solicitacoes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idSolicitacao")
private Long idSolicitacao;
@ManyToOne
@JoinColumn(name = "idMentorado")
private Mentorado mentorado;
@ManyToOne
@JoinColumn(name = "idMentor")
private Mentor mentor;
//Constructors
public Solicitacoes() {
	
}
	public Solicitacoes(Long idSolicitacao, Mentorado mentorado, Mentor mentor) {
		super();
		this.idSolicitacao = idSolicitacao;
		this.mentorado = mentorado;
		this.mentor = mentor;
	}
	//Getters and Setters
	
	public Long getIdSolicitacao() {
		return idSolicitacao;
	}
	public void setIdSolicitacao(Long idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}
	public Mentorado getMentorado() {
		return mentorado;
	}
	public void setMentorado(Mentorado mentorado) {
		this.mentorado = mentorado;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
}
