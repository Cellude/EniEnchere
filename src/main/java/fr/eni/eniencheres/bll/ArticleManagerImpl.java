package fr.eni.eniencheres.bll;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.dal.ArticleDAO;

public class ArticleManagerImpl implements ArticleManager{
	//dependance avec constructeur
	private ArticleDAO articleDAO;

	/**
	 * @param articleDAO
	 */
	public ArticleManagerImpl(ArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void creerArticle(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article consulterDetailArticle(Integer noArticle) {
		// TODO Auto-generated method stub
		return articleDAO.consulterDetailArticle(noArticle);
	}

	@Override
	public Article modifierArticle(Integer noArticle) {
		// TODO Auto-generated method stub
		return articleDAO.modifierArticle(noArticle);
	}

	@Override
	public void supprimerArticle(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> consulterLesArticles() {
	
		return null;
	}

	@Override
	public List<Article> consulterArticlesParLibelle(String libelleArticle) {
		
		return articleDAO.consulterArticlesParLibelle(libelleArticle);
	}

	@Override
	public List<Article> consulterArticlesParCategorie(Integer categorie) {
		
		return articleDAO.consulterArticlesParCategorie(categorie);
	}
	
	public List<Article> afficherArticlesParCategorie(@RequestParam(value = "categorie") int no_categorie, Model model) {	
		
		//	 Critère de recherche (catégorie sélectionnée)
		String categorieRecherchee = "Informatique";

		// Utilisation de Stream pour filtrer les articles par catégorie
		List<Article> articlesFiltres = articleDAO.consulterArticles() ;
    		articlesFiltres.stream()
    		.filter(article -> article.getCategorie().equals(categorieRecherchee))  // Filtrer par catégorie
    		.collect(Collectors.toList());  // Collecter les résultats dans une liste

    		// Affichage des articles filtrés
    		System.out.println("Articles dans la catégorie '" + categorieRecherchee + "':");
    		articlesFiltres.forEach(System.out::println);  // Afficher chaque article filtré
    		return articlesFiltres;
}

	@Override
	public List<Article> afficherArticlesParNom(String nomArticle) {
		// Reprendre le modèle au dessus afficherArticlesParCategorie
		return null;
	}


}
