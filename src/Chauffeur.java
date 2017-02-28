import java.util.*;

public class Chauffeur {
	
	private String nom;
	private String prenom;
	private int anneeEmbauche;
	private String adresse;
	private String numeroIdentification;
	private ArrayList<Trajet> listeTrajets;
	
	private final int NOMBRE_DE_TRAJET_DEFAULT = 100;
	
	
	Chauffeur(String nom, String prenom, int anneeEmbauche, String adresse, String numeroIdentification) {
		this.nom = nom;
		this.prenom = prenom;
		this.anneeEmbauche = anneeEmbauche;
		this.adresse = adresse;
		this.numeroIdentification = numeroIdentification;
		this.listeTrajets = new ArrayList<Trajet>();
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAnneeEmbauche() {
		return anneeEmbauche;
	}
	public void setAnneeEmbauche(int anneeEmbauche) {
		this.anneeEmbauche = anneeEmbauche;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumeroIdentification() {
		return numeroIdentification;
	}
	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}

	

}
