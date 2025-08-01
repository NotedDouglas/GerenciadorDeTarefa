package com.example.demomvc.entity;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarefa {
	
	private Long id;
	private String nome;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrega;
	private String responsavel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", nome=" + nome + ", dataEntrega=" + dataEntrega + ", responsavel=" + responsavel
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataEntrega, id, nome, responsavel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(dataEntrega, other.dataEntrega) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(responsavel, other.responsavel);
	}
	
	
	

}
