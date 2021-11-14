package com.example.demo;

import java.text.ParseException;
import com.example.demo.entities.Entreprise;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.services.IEntrepriseService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class EntrepriseSeriveceImplTests {
	
	@Autowired
	IEntrepriseService entrepriseService;

	@Test
	@Order(1)
	public void testRetrieveAllEntreprise() {
		List<Entreprise> ListeEntreprise = entrepriseService.retrieveAllEntreprise();
		Assertions.assertEquals(6, ListeEntreprise.size());;
		
	}
	
	
	@Test
	@Order(2)
	public void testaddEntreprise() throws ParseException{
		Entreprise e = new Entreprise("tets","bekri");
		Entreprise entrepriseAdded = entrepriseService.addEntreprise(e);
		Assertions.assertEquals(e.getName(),entrepriseAdded.getName());
	
	
	}
	
	//dyfh
	
	@Test
	@Order(3)
	public void testUpdateEntreprise() throws ParseException{
		Entreprise e = new Entreprise(37,"rafik","mastouri");
		Entreprise entrUpdated = entrepriseService.updateEntreprise(e);
		Assertions.assertEquals(e.getName(),entrUpdated.getName());

	}
	
	
	
	@Test
	@Order(4)
	public void testDeleteEntreprise(){
		entrepriseService.deleteEntreprise(423);
		//Assertions.assertNull(entrepriseService.retrieveEntreprise(9));
		
	}


	
	@Test
	@Order(5)
	public void testRetrieveEntreprise(){
		Entreprise entrepriseRetrieved = entrepriseService.retrieveEntreprise(37);
		Assertions.assertEquals(37, entrepriseRetrieved.getId());
		
	}

}
