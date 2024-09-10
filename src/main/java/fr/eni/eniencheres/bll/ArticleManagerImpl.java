package fr.eni.eniencheres.bll;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

}
