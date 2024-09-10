package fr.eni.eniencheres.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.bo.Utilisateur;

public class ArticleDAOImpl implements ArticleDAO {
	// Dependance avec Autowired pour le jdbcTemplate
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void creerArticle(Article article) {
		// TODO Auto-generated method stub
	}

	@Override
	public Article consulterDetailArticle(Integer noArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article modifierArticle(Integer noArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerArticle(Integer noArticle) {
		var sql = "DELETE FROM ARTICLE WHERE noArticle=?;";
		jdbcTemplate.update(sql, Utilisateur.class, noArticle);
	}

	@Override
	public List<Article> consulterArticles() {
		var sql = "select * from ARTICLES_VENDUS;";
		var listArticle = jdbcTemplate.queryForList(sql, Article.class);
		return listArticle;
	}

}
