package fr.eni.eniencheres.bll;

import org.springframework.stereotype.Service;

import fr.eni.eniencheres.bo.Utilisateur;
@Service
public interface UtilisateurManager {
	public void creerUtilisateur(Utilisateur utilisateur);
	public Utilisateur consulterUtilisateur(String email);
	public Utilisateur modifierUtilisateur (Utilisateur utilisateur);
	public void supprimerUtilisateur(Utilisateur utilisateur);
}
