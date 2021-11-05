package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Entreprise;

public interface EntrepriseRepository extends  CrudRepository<Entreprise, Long>{

}