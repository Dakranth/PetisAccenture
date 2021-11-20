	package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {

}
