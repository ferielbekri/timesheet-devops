package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Eleve;

public interface IEleveService { 
	 
	List<Eleve> retrieveAllEleves(); 
	Eleve addEleve(Eleve e);
	void deleteEleve(String id);
	Eleve updateEleve(Eleve e);
	Eleve retrieveEleve(String id);

} 
 