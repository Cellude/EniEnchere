package fr.eni.eniencheres.bll;

import java.util.List;

import fr.eni.eniencheres.bo.Categorie;


public interface CategorieManager {

	List<Categorie> getAllCategories();

	Categorie afficherCategorie(Categorie categorie);
	
	Categorie afficheCategorieParLibelle(String libelle);
}
