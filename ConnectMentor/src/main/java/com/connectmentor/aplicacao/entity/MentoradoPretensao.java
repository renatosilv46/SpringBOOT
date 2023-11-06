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
@Table(name = "MentoradoPretensao")
public class MentoradoPretensao {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_mentorado_pretensao")
private Long idMentoradoPretensao;
@ManyToOne
@JoinColumn(name = "id_mentorado")
private Mentorado mentorado;
@ManyToOne
@JoinColumn(name = "id_pretensao")
private Pretensao pretensao;
//Constructors
public MentoradoPretensao() {
	
}
	public MentoradoPretensao(Long idMentoradoPretensao, Mentorado mentorado, Pretensao pretensao) {
		super();
		this.idMentoradoPretensao = idMentoradoPretensao;
		this.mentorado = mentorado;
		this.pretensao = pretensao;
	}
	//Getters and Setters
	
	public Long getIdMentoradoPretensao() {
		return idMentoradoPretensao;
	}
	public void setIdMentoradoPretensao(Long idMentoradoPretensao) {
		this.idMentoradoPretensao = idMentoradoPretensao;
	}
	public Mentorado getMentorado() {
		return mentorado;
	}
	public void setMentorado(Mentorado mentorado) {
		this.mentorado = mentorado;
	}
	public Pretensao getPretensao() {
		return pretensao;
	}
	public void setPretensao(Pretensao pretensao) {
		this.pretensao = pretensao;
	}
}
