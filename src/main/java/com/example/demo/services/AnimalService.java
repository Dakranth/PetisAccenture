package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Animal;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class AnimalService {
	
@Autowired
private AnimalRepository repo;


	public Animal find(Integer id) {
		Optional<Animal> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Animal.class.getName()));
	}
}
