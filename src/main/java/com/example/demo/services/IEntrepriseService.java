package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Entreprise;


public interface IEntrepriseService {
	List<Entreprise> retrieveAllEntreprise(); 
	Entreprise addEntreprise(Entreprise a);
	void deleteEntreprise(long id);
	Entreprise updateEntreprise(Entreprise a);
	Entreprise retrieveEntreprise(long id);

}