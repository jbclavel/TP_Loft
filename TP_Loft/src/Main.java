import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Loft loft1 = new Loft(2,2);
		
		Viande viande1= new Viande(10);
		Viande viande2= new Viande(3);
		
		ArrayList<Ingredient> ing1_1 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing1_2 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing2_1 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing2_2 = new ArrayList<Ingredient>();
		ing1_1.add(viande1);		
		ing1_2.add(viande2);		
		
		ArrayList<String> nourriture_n1 = new ArrayList<String>();
		nourriture_n1.add("Viande");
		
		Erratique err1 = new Erratique(2,"err1",1,1,loft1,10,nourriture_n1);
		
		ArrayList<Neuneu> lofteurs = new ArrayList<Neuneu>();
		lofteurs.add(err1);
		
		Case c1_1 = new Case(1,1,ing1_1,lofteurs);
		Case c1_2 = new Case(1,2,ing1_2,lofteurs);
		Case c2_1 = new Case(2,1,ing2_1,lofteurs);
		Case c2_2 = new Case(2,2,ing2_2,lofteurs);
		
		loft1.getCases()[1][1]=c1_1;
		loft1.getCases()[1][2]=c1_2;
		loft1.getCases()[2][1]=c2_1;
		loft1.getCases()[2][2]=c2_2;
		
		System.out.println(loft1.getHauteur()+";"+loft1.getLargeur());
		System.out.println(loft1.getCases()[1][1].getAbs());

	}

}
