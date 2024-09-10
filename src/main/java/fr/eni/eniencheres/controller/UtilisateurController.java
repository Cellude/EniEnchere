package fr.eni.eniencheres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.eniencheres.bll.UtilisateurManager;
import fr.eni.eniencheres.bo.Utilisateur;

@Controller
@RequestMapping("/inscription")

public class UtilisateurController {

	// Dépendance
	private UtilisateurManager utilisateurManager;

	public UtilisateurController(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}

	@GetMapping("/inscription")
	public String creerUtilisateur(Model model) {
		var utilisateur = new Utilisateur();
		model.addAttribute("utilisateur", utilisateur);
		model.addAttribute("utilisateur", utilisateurManager.creerUtilisateur(utilisateur));
		return "view-profil-creer";
		
		
	}
}