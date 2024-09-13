package fr.eni.eniencheres.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import fr.eni.eniencheres.bo.Categorie;
@Repository
public class CategorieDAOImpl implements CategorieDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Categorie afficherCategorie(Categorie categorie) {
		var sql ="Select libelle from Categorie where no_categorie=?";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("no_categorie", categorie.getNoCategorie());
		namedParameters.addValue("libelle", categorie.getLibelle());
		return categorie;
		
	}


	@Override
	public List<Categorie> getAllCategories() {
		var sql = "Select * from Categories";
		return jdbcTemplate.query(sql, new CategorieRowMapper() );
	}

	public class CategorieRowMapper implements RowMapper<Categorie> {
	    @Override
	    public Categorie mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	
	    	Categorie c = new Categorie();
	    	c.setNoCategorie(rs.getInt("no_categorie"));
	    	c.setLibelle(rs.getString("libelle"));
	        return c;
	    }

	}

	@Override
	public Categorie afficheCategorieParLibelle(String libelle) {
		var sql = "Select libelle from Categories";
		return jdbcTemplate.queryForObject(sql, Categorie.class, libelle);
	}
}
	




