
public class Limousine {
	
	private String numeroImmatriculation;
	private float capaciteReservoir;
	private int nombrePassagers;
	private String couleur;
	
	Limousine(String numeroImmatriculation, float capaciteReservoir, int nombrePassagers, String couleur){
		this.numeroImmatriculation = numeroImmatriculation;
		this.capaciteReservoir = capaciteReservoir;
		this.nombrePassagers = nombrePassagers;
		this.couleur = couleur;
	}
	
	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}
	public void setNumeroImmatriculation(String numeroImmatriculation) {
		this.numeroImmatriculation = numeroImmatriculation;
	}
	public float getCapaciteReservoir() {
		return capaciteReservoir;
	}
	public void setCapaciteReservoir(float capaciteReservoir) {
		this.capaciteReservoir = capaciteReservoir;
	}
	public int getNombrePassagers() {
		return nombrePassagers;
	}
	public void setNombrePassagers(int nombrePassagers) {
		this.nombrePassagers = nombrePassagers;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void showLimousine(){
		System.out.println(numeroImmatriculation);
		System.out.println(capaciteReservoir);
		System.out.println(nombrePassagers);
		System.out.println(couleur);
	}
}