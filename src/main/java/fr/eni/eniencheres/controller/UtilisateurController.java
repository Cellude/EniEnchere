package fr.eni.eniencheres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.eniencheres.bll.UtilisateurManager;
import fr.eni.eniencheres.bo.Utilisateur;

@Controller
public class UtilisateurController {

    private final UtilisateurManager utilisateurManager;

    public UtilisateurController(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }

    // Affichage de la page index.html
    @GetMapping("/")
    public String index() {
        return "index";  // Le nom de la vue sans l'extension .html
    }

    // Affichage de la page de connexion
 // Affichage de la page de connexion
    @GetMapping("/connexion")
    public String afficherConnexion(Model model) {
        model.addAttribute("utilisateur", new Utilisateur()); // Préparer le formulaire de connexion
        return "view-connecter";  // Le nom de la vue sans l'extension .html
    }

    @PostMapping("/connexion")
    public String afficherConnexion(@RequestParam("pseudo") String pseudo, @RequestParam("prenom") String prenom,
                                    @RequestParam("telephone") String telephone, @RequestParam("codepostal") String codePostal,
                                    @RequestParam("motDePasse") String motDePasse, @RequestParam("nom") String nom,
                                    @RequestParam("email") String email, @RequestParam("rue") String rue,
                                    @RequestParam("ville") String ville, Model model) {
        // Initialiser un nouvel utilisateur avec les valeurs du formulaire
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPseudo(pseudo);
        utilisateur.setPrenom(prenom);
        utilisateur.setTelephone(telephone);
        utilisateur.setCodePostal(codePostal);
        utilisateur.setMotDePasse(motDePasse);
        utilisateur.setNom(nom);
        utilisateur.setEmail(email);
        utilisateur.setRue(rue);
        utilisateur.setVille(ville);

        // Initialisation du crédit à 0 et du statut administrateur à false
        utilisateur.setCredit(0);
        utilisateur.setAdministateur(false);

        // Passer l'utilisateur au modèle pour l'afficher ou le sauvegarder
        model.addAttribute("utilisateur", utilisateur);

        return "view-connecter";  // Retourner à la vue de connexion
    }

    // Traitement du formulaire de connexion
//    @PostMapping("/connexion")
//    public String connecter(@ModelAttribute Utilisateur utilisateur, Model model) {
//       // boolean utilisateurValide = utilisateurManager.consulterUtilisateur(utilisateur);
//        if (utilisateurValide) {
//            // Connexion réussie
//            return "redirect:/index.html"; // Page d'accueil après connexion
//        } else {
//            // Connexion échouée
//            model.addAttribute("message", "Identifiants invalides");
//            return "view-connecter";
//        }
//    }

    // Affichage du formulaire d'inscription
    @GetMapping("/inscription")
    public String afficherInscription(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "view-profil-creer";
    }

    // Traitement du formulaire d'inscription
    @PostMapping("/inscription")
    public String inscrireUtilisateur(@Validated @ModelAttribute("Utilisateur") Utilisateur utilisateur, BindingResult result) {
        if (result.hasErrors()) {
            return "view-profil-creer"; // Retourne au formulaire si des erreurs sont détectées
        }
        utilisateurManager.creerUtilisateur(utilisateur);  // Sauvegarde de l'utilisateur
        return "redirect:/connexion";
    }
}