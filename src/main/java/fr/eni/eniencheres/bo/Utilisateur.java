package fr.eni.eniencheres.bo;


public class Utilisateur { // test version AHUZEFHEF
	private Integer noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private Integer credit;
	private Boolean administateur;
	
	/** Constructeur vide
	 */
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
	/**Constructeur pour la creation d'un utilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 * @param administateur
	 */
	public Utilisateur(String pseudo,String prenom,String telephone, String codePostal, String motDePasse, String nom, String email, String rue,
			 String ville, Integer credit, Boolean administateur) {
		super();
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.telephone = telephone;
		this.codePostal = codePostal;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.email = email; //??
		this.rue = rue;
		this.ville = ville;
		this.credit = credit;
		this.administateur = administateur;
	}

	/**
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 * @param administateur
	 */
	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, Integer credit, Boolean administateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administateur = administateur;
	}



	/**
	 * @return the noUtilisateur
	 */
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}

	/**
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the credit
	 */
	public Integer getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	/**
	 * @return the administateur
	 */
	public Boolean getAdministateur() {
		return administateur;
	}

	/**
	 * @param administateur the administateur to set
	 */
	public void setAdministateur(Boolean administateur) {
		this.administateur = administateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", email="
				+ email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal=" + codePostal + ", ville="
				+ ville + ", motDePasse=" + motDePasse + ", credit=" + credit + ", administateur=" + administateur
				+ "]";
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
