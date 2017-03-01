import java.util.ArrayList;
import java.util.Scanner;

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
	
	public ArrayList<Limousine> getFlotteLimousine(){
		return flotteLimousines;
	}
	
	public ArrayList<Chauffeur> getListeChauffeur(){
		return listeChauffeurs;
	}
	
	public void ajouterChauffeur(String nom, String prenom, int anneeEmbauche, String adresse){
		Chauffeur chauffeur = null;
		try{
		chauffeur = new Chauffeur(nom, prenom, anneeEmbauche, adresse);
		}
		catch(AnneeChauffeurException e) {
			
		}
		listeChauffeurs.add(chauffeur);
	}
	
	public void ajouterLimousine(String numeroImmatriculation, float capaciteReservoir, int nombrePassagers, String couleur) {
		Limousine limousine = new Limousine(numeroImmatriculation, capaciteReservoir, nombrePassagers, couleur);
		flotteLimousines.add(limousine);
	}
	
	public Chauffeur getChauffeurById(String numeroIdentification) {
		Chauffeur chauffeur;
		for(int i = 0; i < listeChauffeurs.size(); i++){
			if(numeroIdentification.equals(listeChauffeurs.get(i).getNumeroIdentification())){
				chauffeur = listeChauffeurs.get(i);
				return chauffeur;
			}
		}
		return null;
	}
	
	public Limousine getLimousineById(String numeroImmatriculation) {
		Limousine limousine;
		for(int i = 0; i < flotteLimousines.size(); i++){
			if(numeroImmatriculation.equals(flotteLimousines.get(i).getNumeroImmatriculation())){
				limousine = flotteLimousines.get(i);
				return limousine;
			}
		}
		return null;
	}
	
	public void afficherListeChauffeurs(){
		for(int i = 0; i < listeChauffeurs.size(); i++)
			listeChauffeurs.get(i).afficherCaracteristiques();
	}
	
	public void afficherFlotteLimousines(){
		for(int i = 0; i < flotteLimousines.size(); i++)
			flotteLimousines.get(i).afficherCaracteristiques();
	}
	
	public void afficherCaracteristiques(){
		System.out.println("------Caracteristiques de la compagnie------");
		System.out.println("Nom : " + nom);
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
}
