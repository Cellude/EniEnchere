package fr.eni.eniencheres.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.eniencheres.bll.ArticleManager;
import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.bo.Categorie;

public class ArticleController {

	private ArticleManager articleManager;
	
	public ArticleController(ArticleManager articleManager) {
		this.articleManager = articleManager;
	}
	
    // Affichage de la page index.html
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("article", new Article());
        return "index";
    }
   

    @PostMapping("/")
    public String submit(@ModelAttribute("article") Article article, BindingResult result) {
		return null;
    
    }
    //Affichage de la page index avec les résultats de la recherche
    @GetMapping("/")
    public String afficherArticleParNom(@RequestParam("nomArticle") String nomArticle, Model model) {
        List<Article> articles = articleManager.afficherArticlesParNom(nomArticle);
        model.addAttribute("articles", articles);
        return "index";
    }
}