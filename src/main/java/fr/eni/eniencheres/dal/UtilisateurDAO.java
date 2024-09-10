package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Utilisateur;

public interface UtilisateurDAO {
	public void creerUtilisateur(Utilisateur utilisateur);
	public Utilisateur consulterUtilisateur(String email);
	public Utilisateur modifierUtilisateur (Integer noUtilisateur);
	public void supprimerUtilisateur(Integer noUtilisateur);

}
