package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class FuncionarioService {
	
@Autowired
private FuncionarioRepository repo;


	public Funcionario find(Integer id) {
		Optional<Funcionario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Funcionario.class.getName()));
	}
}
