package fr.eni.eniencheres.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.bo.Categorie;
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
		return jdbcTemplate.queryForList(sql, Article.class);
	}
	@Override
	public List<Article> consulterArticlesParLibelle(String libelleArticle) {
		var sql = "select nom_article, prix_vente, date_fin_encheres, pseudo from ARTICLES A join UTILISATEURS U on A.no_utilisateur=U.no_utilisateur;";
		return jdbcTemplate.queryForList(sql, Article.class);

	}

	@Override
	public List<Article> consulterArticlesParCategorie(Integer Categorie) {
		var sql = "SELECT nom_article, prixVente, date_fin_encheres, pseudo FROM article where noCategorie=?;";
		return jdbcTemplate.query(sql, ps -> ps.setInt(1, Categorie), new ArticleRowMapper());
	}
	public class ArticleRowMapper implements RowMapper<Article> {
	    @Override
	    public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	
	    	Article a = new Article();
	    	a.setNomArticle(rs.getString("nom_article"));
	    	a.setPrixVente(rs.getInt("prix_vente"));
	    	//a.setDateFinEncheres(rs.getDate("date_fin_encheres"));
	    	
	    	// Association pour l'utilisateur
	    	Utilisateur utilisateur = new Utilisateur();
	    	utilisateur.setPseudo(rs.getString("pseudo"));
	    	a.setUtilisateur(utilisateur);
	    	
	        return a;
	    }
	}
}