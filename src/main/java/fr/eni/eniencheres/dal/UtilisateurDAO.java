package fr.eni.eniencheres.dal;

import org.springframework.stereotype.Repository;

import fr.eni.eniencheres.bo.Utilisateur;
@Repository
public interface UtilisateurDAO {
	public void creerUtilisateur(Utilisateur utilisateur);
	public Utilisateur consulterUtilisateur(String email);
	public Utilisateur modifierUtilisateur (Integer noUtilisateur);
	public void supprimerUtilisateur(Integer noUtilisateur); //??

}
