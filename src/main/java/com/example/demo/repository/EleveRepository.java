package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Eleve;

@Repository
public interface EleveRepository extends  CrudRepository<Eleve, Long> {
	
	
}