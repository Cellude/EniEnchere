package fr.eni.eniencheres.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.eniencheres.bo.Categorie;
import fr.eni.eniencheres.dal.CategorieDAO;
	
@Service
public class CategorieManagerImpl implements CategorieManager{
		//Dependance avec constructeur
		private CategorieDAO categorieDAO;

		/**
		 * @param categorieDAO
		 */
		public CategorieManagerImpl(CategorieDAO categorieDAO) {
			super();
			this.categorieDAO = categorieDAO;
		}

		@Override
		public Categorie afficherCategorie(Categorie categorie) {
			return categorieDAO.afficherCategorie(categorie);
		}

		@Override
		public List<Categorie> getAllCategories() {
			return categorieDAO.getAllCategories();
		}

		@Override
		public Categorie afficheCategorieParLibelle(String libelle) {
		
			return categorieDAO.afficheCategorieParLibelle(libelle);
		}


		

}

