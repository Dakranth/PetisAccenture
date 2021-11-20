package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animalId;
	private String nome;
	private Integer idade;
	private String raca;
	private String tipo;
	
	@ManyToMany(mappedBy="animais")
	List<Funcionario> funcionarios = new ArrayList<>();
	
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="cliente_id")
    private Cliente cliente;

	public Animal() {
		
	}


	public Animal(Integer animalId, String nome, Integer idade, String raca, String tipo,Cliente cliente) {
		super();
		this.animalId = animalId;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.tipo = tipo;
		this.cliente=cliente;
	}


	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Integer getAnimalId() {
		return animalId;
	}


	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(animalId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(animalId, other.animalId);
	}
	
	
}
