
import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean flagProgram = true;
		String str;
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(flagProgram){
			showMenu();
			while(choice < 1 || choice > 4){
				choice = scanner.nextInt();
			}
			System.out.println("Vous avez choisi " + choice);
		}
	}
	
	public static void showMenu(){
		System.out.println("Menu");
		System.out.println("1. R�server une limousine");
		System.out.println("2. Trouver les limousines conduites par un chauffeur donn�");
		System.out.println("3. Afficher les caract�ristiques des trajets effectu�s");
		System.out.println("4. Afficher les caract�ristiques des limousines utilis�es");
	}
	
	public static void runChoice(int choice){
		switch(choice){
			case 1 :
				System.out.println("");
			case 2 :
				System.out.println("");
			case 3 :
				System.out.println("");
			case 4 :
				System.out.println("");
			default :
				System.out.println("");
		}
	}
			

}
