
public class Trajet {
	
	private String villeDepart;
	private String villeArrivee;
	private int kilometrageDepart;
	private int kilometrageArrivee;
	private Limousine limousine;
	private Chauffeur chauffeur;
	
	Trajet(String villeDepart, String villeArrivee, int kilometrageDepart, Limousine limousine, Chauffeur chauffeur){
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.kilometrageDepart = kilometrageDepart;
		this.limousine = limousine;
		this.chauffeur = chauffeur;
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
}
