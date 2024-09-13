package fr.eni.eniencheres.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.eniencheres.bll.ArticleManager;
import fr.eni.eniencheres.bll.CategorieManager;
import fr.eni.eniencheres.bo.Article;
import fr.eni.eniencheres.bo.Categorie;


@Controller
// Injection de la liste des attributs en session
@SessionAttributes({"categorieEnSession"})
public class CategorieController {

		// Dépendances
	
		private CategorieManager categorieManager;
		private ArticleManager articleManager;
		
		public CategorieController(CategorieManager categorieManager) {
			this.categorieManager = categorieManager;
		}
		
		@ModelAttribute("categorieEnSession")
		public List<Categorie> loadCategories() {
			System.out.println(categorieManager.getAllCategories());
			return categorieManager.getAllCategories();
		}
		
	    // Affichage de la page index.html
	    @GetMapping("/")
	    public String index(Model model) {
	    		    	
	        model.addAttribute("categories", categorieManager.getAllCategories());
	        return "index";
	    }

//	    @PostMapping("/")
//	    public String submit(@ModelAttribute("noCategorie") Integer noCategorie, BindingResult result) {
//			return "index";
//	    
//	    }
	    
		
	 
}
