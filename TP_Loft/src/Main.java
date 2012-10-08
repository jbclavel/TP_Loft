import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Loft loft1 = new Loft(2,2);
		
		Viande viande1= new Viande(10);
		Viande viande2= new Viande(3);
		
		ArrayList<Ingredient> ing1_1 = new ArrayList();
		ArrayList<Ingredient> ing1_2 = new ArrayList();
		ArrayList<Ingredient> ing2_1 = new ArrayList();
		ArrayList<Ingredient> ing2_2 = new ArrayList();
		ing1_1.add(viande1);		
		ing1_2.add(viande2);		
		
		Case c1_1 = new Case(1,1,ing1_1);
		Case c1_2 = new Case(1,2,ing1_2);
		Case c2_1 = new Case(2,1,ing2_1);
		Case c2_2 = new Case(2,2,ing2_2);
		
		loft1.getCases()[1][1]=c1_1;
		loft1.getCases()[1][2]=c1_2;
		loft1.getCases()[2][1]=c2_1;
		loft1.getCases()[2][2]=c2_2;
		
		System.out.println(loft1.getHauteur()+";"+loft1.getLargeur());
		System.out.println(loft1.getCases()[1][1].getAbs());

	}

}
