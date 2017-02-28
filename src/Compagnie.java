import java.util.ArrayList;

public class Compagnie {
	
	private String nom;
	private ArrayList<Limousine> flotteLimousines;
	private ArrayList<Chauffeur> listeChauffeurs;
	
	Compagnie(String nom){
		this.setNom(nom);
		flotteLimousines = new ArrayList<Limousine>();
		listeChauffeurs = new ArrayList<Chauffeur>();	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void ajouterChauffeur(String nom, String prenom, int anneeEmbauche, String adresse){
		Chauffeur chauffeur = new Chauffeur(nom, prenom, anneeEmbauche, adresse);
		listeChauffeurs.add(chauffeur);
	}
	
	public void ajouterLimousine(String numeroImmatriculation, float capaciteReservoir, int nombrePassagers, String couleur) {
		Limousine limousine = new Limousine(numeroImmatriculation, capaciteReservoir, nombrePassagers, couleur);
		flotteLimousines.add(limousine);
	}
	
	public void afficherListeChauffeurs(){
		for(int i = 0; i < listeChauffeurs.size(); i++)
			listeChauffeurs.get(i).afficherCaracteristiques();
	}
	
	public void afficherFlotteLimousines(){
		for(int i = 0; i < flotteLimousines.size(); i++)
			flotteLimousines.get(i).afficherCaracteristiques();
	}
	/*public void getChauffeur(String numeroImmatriculation) {
		
	}*/
	
	public void afficherCaracteristiques(){
		System.out.println("------Caracteristiques de la compagnie------");
		System.out.println("Nom : " + nom);
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
}
