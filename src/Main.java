
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Compagnie compagnie = new Compagnie("AutoSuperieur"); // Initialisation de la compagnie
		boolean flagProgramme = true;
		String str;
		int choix = 0;
		Scanner scanner = new Scanner(System.in);
		
		remplissageDonnees(compagnie);
		compagnie.afficherFlotteLimousines();
		compagnie.afficherListeChauffeurs();
		
		while(flagProgramme){
			afficherMenu();
			while(choix < 1 || choix > 4){
				choix = scanner.nextInt();
			}
			System.out.println("Vous avez choisi " + choix);
		}
		scanner.close(); // Fermeture du scanner, plus de saisie possible
	}
	
	public static void afficherMenu(){
		System.out.println("Menu");
		System.out.println("1. Réserver une limousine");
		System.out.println("2. Trouver les limousines conduites par un chauffeur donné");
		System.out.println("3. Afficher les caractéristiques des trajets effectués");
		System.out.println("4. Afficher les caractéristiques des limousines utilisées");
		System.out.println("5. Ajouter un chauffeur");
		System.out.println("6. Ajouter une limousine à un chauffeur");
		System.out.println("7. Ajouter un trajet");
	}
	
	public static void lancerChoix(int choice){
		switch(choice){
			case 1 :
				//reserverLimousine();
			case 2 :
				//trouverLimousine();
			case 3 :
				//afficherTrajet();
			case 4 :
				//afficherLimousine();
			case 5 :
				//ajouterChauffeur();
			case 6 : 
				//ajouterLimousine();
			case 7 :
				//ajouterTrajet);
		}
	}	
	
	public static void remplissageDonnees(Compagnie compagnie){
		compagnie.ajouterChauffeur("Benjamin", "De Castro", 2015, "Pontault-Combault");
		compagnie.ajouterChauffeur("Alexandre", "Nguyen", 2010, "Paris");
		compagnie.ajouterChauffeur("Vincent", "Kwan-Teau", 1999, "Trois-Rivieres");
		compagnie.ajouterChauffeur("Georges", "Pill", 2004, "Montreal");
		compagnie.ajouterChauffeur("Lisa", "Delcourtes", 2017, "Pontault-Combault");
		compagnie.ajouterLimousine("1023EDAZ9", 40F, 5, "Blanche");
		compagnie.ajouterLimousine("2034AZ9F", 40F, 5, "Jaune");
		compagnie.ajouterLimousine("1209RAZ9", 40F, 5, "Rouge");
	}

}
