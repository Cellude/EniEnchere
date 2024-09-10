package fr.eni.eniencheres.dal;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.eni.eniencheres.bo.Utilisateur;
@Repository
public class UtilisateurDAOImpl implements UtilisateurDAO {
	// Dependance avec l'autowired
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		var sql = "INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe,credit,administrateur) VALUES (:pseudo,:nom,:prenom,:email,:telephone,:rue,:code_postal,:ville,:mot_de_passe,:credit, :administrateur)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	//	namedParameters.addValue("no_utilisateur", utilisateur.getNoUtilisateur());//Impossible d'insérer une valeur dans la colonne identité quand IDENTITY_INSERT est défini à OFF.
		namedParameters.addValue("pseudo", utilisateur.getPseudo());
		namedParameters.addValue("nom", utilisateur.getNom());
		namedParameters.addValue("prenom", utilisateur.getPrenom());
		namedParameters.addValue("email", utilisateur.getEmail());
		namedParameters.addValue("telephone", utilisateur.getTelephone());
		namedParameters.addValue("rue", utilisateur.getRue());
		namedParameters.addValue("code_postal", utilisateur.getCodePostal());
		namedParameters.addValue("ville", utilisateur.getVille());
		namedParameters.addValue("mot_de_passe", utilisateur.getMotDePasse());
		namedParameters.addValue("credit", utilisateur.getCredit());
		namedParameters.addValue("administrateur", utilisateur.getAdministateur());
		namedParameterJdbcTemplate.update(sql, namedParameters);

	}

	@Override
	public Utilisateur modifierUtilisateur(Integer noUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUtilisateur(Integer noUtilisateur) {
		var sql = "DELETE FROM UTILISATEUR WHERE noUtilisateur=?;";
		jdbcTemplate.update(sql, Utilisateur.class, noUtilisateur);
	}

	@Override
	public Utilisateur consulterUtilisateur(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Classe de mapping pour recreer un objet utilisateur avec des attributs diff
	 * des noms de SQL
	 */
	class UtilisateurRowMapper implements RowMapper<Utilisateur> {
		@Override
		public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
			Utilisateur u = new Utilisateur();
			u.setPseudo(rs.getString("PSEUDO"));
			u.setNom(rs.getString("NOM"));
			u.setPrenom(rs.getString("PRENOM"));
			u.setEmail(rs.getString("EMAIL"));
			u.setTelephone(rs.getString("TELEPHONE"));
			u.setRue(rs.getString("RUE"));
			u.setCodePostal(rs.getString("CODE_POSTAL"));
			u.setVille(rs.getString("VILLE"));
			u.setMotDePasse(rs.getString("MOT_DE_PASSE"));
			u.setCredit(rs.getInt("CREDIT"));
			u.setAdministateur(rs.getBoolean("ADMINISTRATEUR"));
			return u;

		}
	}
}