package fr.eni.eniencheres.bo;

public class Categorie {
	private Integer noCategorie;
	private String libelle;
	
	/** Constructeur vide
	 */
	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	/** Constructeur complet
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(Integer noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}
	
	/**
	 * @return the noCategorie
	 */
	public Integer getNoCategorie() {
		return noCategorie;
	}
	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}
}
