package Converter;

import org.springframework.core.convert.converter.Converter;

import fr.eni.eniencheres.bll.CategorieManager;
import fr.eni.eniencheres.bo.Categorie;

public class categorieConverter implements Converter<String, Categorie>{

	private CategorieManager categorieManager;
	
 
	public categorieConverter(CategorieManager categorieService) {
		super();
		this.categorieManager = categorieService;
	}


	@Override
	public Categorie convert(String libelle) {
		
		return categorieManager.afficheCategorieParLibelle(libelle);
	}


	}





