package fr.eni.eniencheres.dal;

import java.util.List;

import fr.eni.eniencheres.bo.Article;

public interface ArticleDAO {
	public void creerArticle (Article article);
	public Article consulterDetailArticle(Integer noArticle);
	public List<Article> consulterArticles();
	public Article modifierArticle(Integer noArticle);
	public void supprimerArticle(Integer noArticle);
}
