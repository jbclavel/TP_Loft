import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Neuneu> neuneus = new ArrayList<Neuneu>();
		ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
		
		Loft loft = new Loft(Saison1.tailleLofthauteur,Saison1.tailleLoftlargeur,neuneus, ingredient);
		
		for (int i=1; i<= Saison1.nombreLofteurs;i++){
					neuneus.add(new Erratique((int)(Math.random()*(Saison1.tailleLofthauteur))+1,
							(int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
							loft,
							10));
			}
						
			for (int i=1; i<= Saison1.nombreIngredient;i++){
					ingredient.add(new Viande((int)(Math.random()*(Saison1.tailleLofthauteur))+1,
								(int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
								(int)(Math.random()*10)));
			}	
			
			loft.creationCase();
			loft.majCase();
			loft.visualisation();
			int i=0;
			while(i <10){
				
				Reader r = new InputStreamReader(System.in);
				try {
					r.read();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				
				neuneus.get(0).cycledevie();
				loft.visualisation();
				loft.majCase();
				i++;
			}
						
			
			
			}}
	
			
/*	
 * des que j'appuie sur enter : for neuneus.get(h).cycle de vie(){}
 * 								end for
 * 								visualisation;
 * 
 * public static void main(String[] args) {
		Loft loft1 = new Loft(2,2);
		
		Viande viande1= new Viande(10);
		Viande viande2= new Viande(3);
		
		ArrayList<Ingredient> ing0_0 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing0_1 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing1_0 = new ArrayList<Ingredient>();
		ArrayList<Ingredient> ing1_1 = new ArrayList<Ingredient>();
		ing0_0.add(viande1);		
		ing0_1.add(viande2);		
		
		ArrayList<String> nourriture_n1 = new ArrayList<String>();
		nourriture_n1.add("Viande");
		
		Erratique err1 = new Erratique(2,"err1",0,0,loft1,10,nourriture_n1);
		
		ArrayList<Neuneu> neuneus0_0 = new ArrayList<Neuneu>();
		ArrayList<Neuneu> neuneus0_1 = new ArrayList<Neuneu>();
		ArrayList<Neuneu> neuneus1_0 = new ArrayList<Neuneu>();
		ArrayList<Neuneu> neuneus1_1 = new ArrayList<Neuneu>();
		
		neuneus0_0.add(err1);
		
		Case c0_0 = new Case(0,0,ing0_0,neuneus0_0);
		Case c0_1 = new Case(0,1,ing0_1,neuneus0_1);
		Case c1_0 = new Case(1,0,ing1_0,neuneus1_0);
		Case c1_1 = new Case(1,1,ing1_1,neuneus1_1);
		
		loft1.getCases()[0][0]=c0_0;
		loft1.getCases()[0][1]=c0_1;
		loft1.getCases()[1][0]=c1_0;
		loft1.getCases()[1][1]=c1_1;
		
		System.out.println(loft1.getHauteur()+";"+loft1.getLargeur());
		System.out.println(loft1.getCases()[0][0].getNomNeuneu());

	}
*/
