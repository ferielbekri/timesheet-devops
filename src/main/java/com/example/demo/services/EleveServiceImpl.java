package com.example.demo.services;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Eleve;
import com.example.demo.repository.EleveRepository;



@Service
public class EleveServiceImpl implements IEleveService {

	@Autowired
	EleveRepository eleveRepository;
	
	private static final Logger L = LogManager.getLogger(EleveServiceImpl.class);


	@Override
	public List<Eleve> retrieveAllEleves() {
		List<Eleve> eleves = null; 
		try {
	
			// TODO Log à ajouter en début de la méthode 
			L.info("In methode retrieveAllEleves");
			eleves = (List<Eleve>) eleveRepository.findAll();  
			L.debug("Connexion a la DB ok");
			// int i = 1/0 ;
			for (Eleve eleve : eleves) {
				// TODO Log à ajouter pour affiher chaque user dans les logs  
				L.debug("Eleves :" + eleve.getLastName());
				
			} 
			L.info("Out methode retrieveAllEleves");

			// TODO Log à ajouter à la fin de la méthode 
		}catch (Exception e) {
			// TODO Log à ajouter pour gérer les erreurs 
			L.error("Out methode retrieveAllEleves with Errors :" + e);

		}

		return eleves;
	}


	@Override
	public Eleve addEleve(Eleve e) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In methode addEleve");

				Eleve u_saved = eleveRepository.save(e); 
				// TODO Log à ajouter à la fin de la méthode 
				L.info("Out methode addEleve");

				return u_saved; 
	}


	@Override
	public void deleteEleve(String id) {
		// TODO Log à ajouter en début de la méthode 
				eleveRepository.deleteById(Long.parseLong(id)); 
				// TODO Log à ajouter à la fin de la méthode 
		
	}


	@Override
	public Eleve updateEleve(Eleve e) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In methode updateEleve");

				Eleve e_saved = eleveRepository.save(e); 
				// TODO Log à ajouter à la fin de la méthode 
				L.info("Out methode updateEleve");

				return e_saved; 
	}


	@Override
	public Eleve retrieveEleve(String id) {
		Eleve l = null ; 
		// TODO Log à ajouter en début de la méthode 
		L.info("In methode retrieveEleve");
		try {

				//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
				Eleve u =  eleveRepository.findById(Long.parseLong(id)).get(); 
		} 
				
         catch (Exception e){
        	 L.error("error in retrieveEleve() : " + e);
         }
		// TODO Log à ajouter à la fin de la méthode 
		
		L.info("In methode retrieveEleve");
		return l; 
		
	}

}