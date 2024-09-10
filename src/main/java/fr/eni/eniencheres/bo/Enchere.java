package fr.eni.eniencheres.bo;

import java.time.LocalDate;

public class Enchere {
	private LocalDate dateEnchere;
	private Integer montantEnchere;
	//Relation
	private Utilisateur utilisateur;
	private Article articleVendu;
	
	/** Constructeur vide
	 */
	public Enchere() {
		// TODO Auto-generated constructor stub
	}
	/** Constructeur complet
	 * @param dateEnchere
	 * @param montantEnchere
	 * @param utilisateur
	 * @param articleVendu
	 */
	public Enchere(LocalDate dateEnchere, Integer montantEnchere, Utilisateur utilisateur, Article articleVendu) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.utilisateur = utilisateur;
		this.articleVendu = articleVendu;
	}
	/**
	 * @return the dateEnchere
	 */
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	/**
	 * @param dateEnchere the dateEnchere to set
	 */
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	/**
	 * @return the montantEnchere
	 */
	public Integer getMontantEnchere() {
		return montantEnchere;
	}
	/**
	 * @param montantEnchere the montantEnchere to set
	 */
	public void setMontantEnchere(Integer montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	/**
	 * @return the articleVendu
	 */
	public Article getArticleVendu() {
		return articleVendu;
	}
	/**
	 * @param articleVendu the articleVendu to set
	 */
	public void setArticleVendu(Article articleVendu) {
		this.articleVendu = articleVendu;
	}
	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere + ", utilisateur="
				+ utilisateur + ", articleVendu=" + articleVendu + "]";
	}
	
}
