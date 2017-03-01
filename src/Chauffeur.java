import java.util.*;

public class Chauffeur {
	
	private String nom;
	private String prenom;
	private int anneeEmbauche;
	private String adresse;
	private String numeroIdentification;
	private ArrayList<Trajet> listeTrajets;
	
	private final int NOMBRE_DE_TRAJET_DEFAULT = 100;
	
	
	Chauffeur(String nom, String prenom, int anneeEmbauche, String adresse) throws AnneeChauffeurException {
		int annee = Calendar.getInstance().get(Calendar.YEAR);
			if(anneeEmbauche > annee) {
				throw new AnneeChauffeurException();
			}
			else {
				String anneeStr = Integer.toString(anneeEmbauche);
				this.nom = nom;
				this.prenom = prenom;
				this.anneeEmbauche = anneeEmbauche;
				this.adresse = adresse;
				this.numeroIdentification = (String)nom.subSequence(0, 3) + prenom.charAt(0) //  numero composé des 3 premiers caracteres du nom, du 1er du prénom
												+ anneeStr.subSequence(anneeStr.length() - 2, anneeStr.length()); // et des deux derniers chiffres de l'année d'embauche
				this.listeTrajets = new ArrayList<Trajet>();
			}
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
	
	public void ajouterTrajet(String villeDepart, String villeArrivee, int kilometrageDepart, int kilometrageArrivee, Limousine limousine){
		Trajet trajet=new Trajet(villeDepart,villeArrivee,kilometrageDepart, kilometrageArrivee, limousine);
		this.listeTrajets.add(trajet);
	}
	
	public void ajouterReservation(String villeDepart, String villeArrivee, int kilometrageDepart, Limousine limousine){
		Trajet trajet=new Trajet(villeDepart,villeArrivee,kilometrageDepart,limousine);
		this.listeTrajets.add(trajet);
	}
	
	public ArrayList<Limousine> getListLimousine(){
		ArrayList<Limousine> listeLimousine = new ArrayList<Limousine>();
		for(int i=0;i<listeTrajets.size();i++){
			listeLimousine.add(listeTrajets.get(i).getLimousine());
		}
		return listeLimousine;
	}
	
	public boolean trouverLimousine(Limousine limousine){
		for(int i=0;i<listeTrajets.size();i++){
			if(listeTrajets.get(i).getLimousine().getNumeroImmatriculation().equals(limousine.getNumeroImmatriculation()))
				return true;
		}
		return false;
	}
	
	public void afficherTrajetEffectue(){
		for(int i=0;i<listeTrajets.size();i++){
			if(listeTrajets.get(i).getKilometrageArrivee()!=-1){
				listeTrajets.get(i).afficherCaracteristiques();
			}
		}
	}
	
	public void afficherCaracteristiques(){
		System.out.println("------Caracteristiques du chauffeur------");
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Annee d'embauche : " + anneeEmbauche);
		System.out.println("Adresse : " + adresse);
		System.out.println("Numero d'immatriculation : " + numeroIdentification);
		System.out.println("Liste de trajet :");
		for(int i = 0; i < listeTrajets.size(); i++) {
			System.out.println("- Trajet " + i + " :" + listeTrajets.get(i));
		}
		System.out.println("-----------------------------------------");
		System.out.println();
	}

	

}
