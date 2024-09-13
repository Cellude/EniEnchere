package fr.eni.eniencheres;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.eni.eniencheres.bll.CategorieManager;
import fr.eni.eniencheres.bll.UtilisateurManager;
import fr.eni.eniencheres.bo.Utilisateur;

@SpringBootApplication
public class EniEncheresApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EniEncheresApplication.class, args);
		
		
		
//		UtilisateurManager utilisateurManager = (UtilisateurManager) context.getBean("utilisateurManagerImpl");
//		//A FAIRE CREE UTILISATEUR
//		Utilisateur utilisateur = new Utilisateur ("Pseudo","Nom","Prenom","email","telephone","rue","codepostal","ville","motdepasse",0,true);
//		
//		utilisateurManager.creerUtilisateur(utilisateur);
//	}
	
		
		
	
	
}

	
}
