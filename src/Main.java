
import java.util.*;

public class Main {

	private static Compagnie compagnie;
	
	public static void main(String[] args) {
		compagnie = new Compagnie("AutoSuperieur"); // Initialisation de la compagnie
		boolean flagProgramme = true;
		String str;
		int choix = 0;
		Scanner scanner = new Scanner(System.in);
		
		remplissageDonnees(compagnie);
		
		while(flagProgramme){
			afficherMenu();
			while(choix < 1 || choix > 9){
				choix = scanner.nextInt();
			}
			System.out.println("Vous avez choisi " + choix);
			lancerChoix(choix);
			choix = 0;
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
		System.out.println("6. Ajouter une limousine");
		System.out.println("7. Ajouter un trajet");
		System.out.println("8. Afficher liste chauffeurs");
		System.out.println("9. Afficher flotte limousines");
	}
	
	public static void lancerChoix(int choice){
		switch(choice){
			case 1 :
				System.out.println("1");
				menuReserverLimousine();
				break;
			case 2 :
				menuAfficherListeLimousineChauffeur();
				break;
			case 3 :
				menuAfficherTrajetsEffectues();
				break;
			case 4 :
				menuAfficherLimousinesUtilises();
				break;
			case 5 :
				menuAjouterChauffeur();
				break;
			case 6 :
				menuAjouterLimousine();
				break;
			case 7 :
				menuAjouterTrajet();
				break;
			case 8 :
				menuAfficherListeChauffeurs();
				break;
			case 9 : 
				menuAfficherFlotteLimousines();
				break;
		}
	}	

	public static void remplissageDonnees(Compagnie compagnie){
		compagnie.ajouterChauffeur("Benjamin", "De Castro", 2015, "Pontault-Combault");
		compagnie.ajouterChauffeur("Alexandre", "Nguyen", 2010, "Paris");
		compagnie.ajouterChauffeur("Vincent", "Kwan-Teau", 1997, "Trois-Rivieres");
		compagnie.ajouterChauffeur("Georges", "Pill", 2004, "Montreal");
		compagnie.ajouterChauffeur("Lisa", "Delcourtes", 2017, "Pontault-Combault");
	//	compagnie.ajouterChauffeur("Al", "N", 2018, "Montreal");
		compagnie.ajouterLimousine("1023EDAZ", 40F, 5, "Blanche");
		compagnie.ajouterLimousine("2034AZ9F", 40F, 5, "Jaune");
		compagnie.ajouterLimousine("1209RAZ9", 40F, 5, "Rouge");
	}
	
	public static void menuReserverLimousine(){
			String numId;
			String numImm;
			String villeD;
			String villeA;
			int kilometrageD;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Entrez le numéro d'identification du chauffeur : ");
			numId = scanner.nextLine();
			System.out.println("Entrez le numéro d'immatriculation de la limousine : ");
			numImm = scanner.nextLine();
			System.out.println("Entrez la ville de départ : ");
			villeD = scanner.nextLine();
			System.out.println("Entrez la ville d'arrivée : ");
			villeA = scanner.nextLine();
			System.out.println("Entrez le kilometrage de départ : ");
			kilometrageD = scanner.nextInt();
			Chauffeur chauffeur = compagnie.getChauffeurById(numId);
			Limousine limousine = compagnie.getLimousineById(numImm);
			chauffeur.ajouterReservation(villeD, villeA, kilometrageD, limousine);
			System.out.println("Vous avez réservé la limousine "+limousine.getNumeroImmatriculation());
	}
	
	public static void menuAfficherListeLimousineChauffeur(){
		Scanner scanner = new Scanner(System.in);
		String numId;
		System.out.println("Entrez le numéro d'identification du chauffeur : ");
		numId = scanner.nextLine();
		Chauffeur chauffeur = compagnie.getChauffeurById(numId);
		ArrayList<Limousine> listeLimousine = chauffeur.getListLimousine();
		for(int i = 0; i < listeLimousine.size(); i++){
			System.out.println("Les limousines conduitent par " + chauffeur.getNom());
			System.out.println(listeLimousine.get(i).getNumeroImmatriculation());
		}
	}
	
	public static void menuAfficherTrajetsEffectues(){
		for(int j = 0; j < compagnie.getListeChauffeur().size();j++){
			compagnie.getListeChauffeur().get(j).afficherTrajetEffectue();
		}
	}
	
	private static void menuAfficherLimousinesUtilises() {
		for(int i = 0; i < compagnie.getFlotteLimousine().size(); i++){
			for(int j = 0; j < compagnie.getListeChauffeur().size();j++){
				if(compagnie.getListeChauffeur().get(j).trouverLimousine(compagnie.getFlotteLimousine().get(i))==true){				
					compagnie.getFlotteLimousine().get(i).afficherCaracteristiques();
				}
			}
		}
	}
	
	public static void menuAjouterChauffeur(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez le nom du chauffeur: ");	
		String nom = scanner.next();
		
		System.out.println("Entrez le prénom du chauffeur: ");
        String prenom = scanner.next();

        System.out.println("Entrez l'année d'embauche: ");
        int anneeEmbauche = scanner.nextInt();

        System.out.println("Entrez l'adresse du chauffeur: ");
        String adresse = scanner.next();
        
        compagnie.ajouterChauffeur(nom,prenom,anneeEmbauche,adresse);
        System.out.println("Un nouveau chauffeur a été ajouté");
	}
	
	public static void menuAjouterLimousine(){
		Scanner scanner = new Scanner(System.in);
        System.out.print("\nEntrez le numéro d'immatriculation : ");
        String numeroImmatriculation = scanner.next();

        System.out.print("\nEntrez la capacité du réservoir: ");
        int capaciteReservoir = scanner.nextInt();

        System.out.print("\nEntrez la capacité de passagers : ");
        int nombrePassagers = scanner.nextInt();

        System.out.print("\nEntrez la couleur : ");
        String couleur = scanner.next();
        
        compagnie.ajouterLimousine(numeroImmatriculation, capaciteReservoir, nombrePassagers, couleur);
        System.out.println("\nUne nouvelle limousine a été ajoutée");
	}
	
	public static void menuAjouterTrajet(){
		String numId;
		String numImm;
		String villeD;
		String villeA;
		int kilometrageD;
		int kilometrageA;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez le numéro d'identification du chauffeur : ");
		numId = scanner.nextLine();
		System.out.println("Entrez le numéro d'immatriculation de la limousine : ");
		numImm = scanner.nextLine();
		System.out.println("Entrez la ville de départ : ");
		villeD = scanner.nextLine();
		System.out.println("Entrez la ville d'arrivée : ");
		villeA = scanner.nextLine();
		System.out.println("Entrez le kilometrage de départ : ");
		kilometrageD = scanner.nextInt();
		System.out.println("Entrez le kilometrage d'arrivee : ");
		kilometrageA = scanner.nextInt();
		Chauffeur chauffeur = compagnie.getChauffeurById(numId);
		Limousine limousine = compagnie.getLimousineById(numImm);
		chauffeur.ajouterTrajet(villeD, villeA, kilometrageD, kilometrageA, limousine);
		System.out.println("Vous avez ajouté un nouveau trajet.");
	}

	private static void menuAfficherListeChauffeurs() {
		compagnie.afficherListeChauffeurs();
	}
	
	private static void menuAfficherFlotteLimousines() {
		compagnie.afficherFlotteLimousines();
	}

}
