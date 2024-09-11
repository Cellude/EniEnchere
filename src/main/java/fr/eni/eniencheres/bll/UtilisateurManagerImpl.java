package fr.eni.eniencheres.bll;

import org.springframework.stereotype.Service;

import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.UtilisateurDAO;

@Service
public class UtilisateurManagerImpl implements UtilisateurManager {
	// Dependance avec Constructeur
	private UtilisateurDAO utilisateurDAO;

	/**
	 * @param utilisateurDAO
	 */
	public UtilisateurManagerImpl(UtilisateurDAO utilisateurDAO) {
		super();
		this.utilisateurDAO = utilisateurDAO;
	}

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		// ICI LES REGLES METIER
		utilisateurDAO.creerUtilisateur(utilisateur);

	}

	@Override
	public Utilisateur consulterUtilisateur(String email) {
		// ICI LES REGLES METIER
		return utilisateurDAO.consulterUtilisateur(email);
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	
		
	}


