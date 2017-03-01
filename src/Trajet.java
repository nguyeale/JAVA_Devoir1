
public class Trajet {
	
	private String villeDepart;
	private String villeArrivee;
	private int kilometrageDepart;
	private int kilometrageArrivee; // Si le kilometrage d'arrivee vaut -1, cela signifie que le trajet n'a pas encore été effectué
	private Limousine limousine;
	
	Trajet(String villeDepart, String villeArrivee, int kilometrageDepart, Limousine limousine){ // Reservation
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.kilometrageDepart = kilometrageDepart;
		this.kilometrageArrivee = -1;
		this.limousine = limousine;
	}
	
	Trajet(String villeDepart, String villeArrivee, int kilometrageDepart, int kilometrageArrivee, Limousine limousine){
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.kilometrageDepart = kilometrageDepart;
		this.kilometrageArrivee = kilometrageArrivee;
		this.limousine = limousine;
	}
	
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrivee() {
		return villeArrivee;
	}
	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}
	public int getKilometrageDepart() {
		return kilometrageDepart;
	}
	public void setKilometrageDepart(int kilometrageDepart) {
		this.kilometrageDepart = kilometrageDepart;
	}
	public int getKilometrageArrivee() {
		return kilometrageArrivee;
	}
	public void setKilometrageArrivee(int kilometrageArrivee) {
		this.kilometrageArrivee = kilometrageArrivee;
	}
	public Limousine getLimousine() {
		return limousine;
	}
	public void setLimousine(Limousine limousine) {
		this.limousine = limousine;
	}
	
	public void afficherCaracteristiques(){
		System.out.println("------Caracteristiques du trajet------");
		System.out.println("Ville de depart : " + villeDepart);
		System.out.println("Ville d'arrivee : " + villeArrivee);
		System.out.println("Kilometrage de depart : " + kilometrageDepart);
		//System.out.println("Kilometrage d'arrivee : " + adresse);
		limousine.afficherCaracteristiques();
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
}
