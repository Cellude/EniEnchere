package fr.eni.eniencheres.dal;

import java.util.List;

import fr.eni.eniencheres.bo.Categorie;

public interface CategorieDAO {

	List<Categorie> getAllCategories();

	Categorie afficherCategorie(Categorie Categorie);
	Categorie afficheCategorieParLibelle(String libelle);
}
