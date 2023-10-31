package br.edu.senai.SA6_UC9.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cadastro_atividade")
public class Stakeholder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "atividade")
	private String atividade;
	
	@Column(name = "responsavel")
	private String responsavel;
	
	
	@Column(name = "dependencia")
	private short dependencia;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "dataInicio")
	private LocalDate dataInicio;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "dataFinal")
	private LocalDate dataFinal;
	

	public short getId() {
		return id;
	}


	public void setId(short id) {
		this.id = id;
	}


	public String getAtividade() {
		return atividade;
	}


	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public short getDependencia() {
		return dependencia;
	}


	public void setDependencia(short dependencia) {
		this.dependencia = dependencia;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
}
