package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Funcionario;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.FuncionarioRepository;

@SpringBootApplication
public class PetisAccentureApplication implements CommandLineRunner {

	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(PetisAccentureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente cliente1 = new Cliente(null, "Matheus", "Recife", "70392391", "matheus123@hotmail.com", "123456",
				"99874239", "BOLETO");
		clienteRepository.saveAll(Arrays.asList(cliente1));

		Animal animal1 = new Animal(null, "Fred", 15, "Poodle", "Cachorro", cliente1);

		animalRepository.saveAll(Arrays.asList(animal1));
		
		Funcionario funcionario1 = new Funcionario(null, "Roberto", "Recife", "12345678910", "roberto321@hotmail.com", "654321",
				"99877289", "Conta-Corrente", "3331223");		
		funcionarioRepository.saveAll(Arrays.asList(funcionario1));

	}
}
