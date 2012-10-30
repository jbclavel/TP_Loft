import java.io.*;
import java.util.ArrayList;
//changer le Loft.neuneus.get(0).getLoft()
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Neuneu> neuneus = new ArrayList<Neuneu>();
		ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
		
		Loft loft = new Loft(Saison1.tailleLoftlargeur,Saison1.tailleLofthauteur,neuneus, ingredient);
		
		
		while(neuneus.size()!=Saison1.nombreLofteurs){
			
			while(neuneus.size()!=Saison1.nombreLofteurs){
				int deTypeLofteur = (int)(Math.random()*10);
			switch (deTypeLofteur) {
				case 0 : case 1 : case 2 : case 3 :
					neuneus.add(new Erratique((int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
							(int)(Math.random()*(Saison1.tailleLofthauteur))+1,
							loft,
							10));
							
				break;
				case 4 : case 5 : case 6 :
					neuneus.add(new Lapin((int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
							(int)(Math.random()*(Saison1.tailleLofthauteur))+1,
							loft,
							10));
				break;
			
				case 7 : case 8 :
					neuneus.add(new Vorrace((int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
							(int)(Math.random()*(Saison1.tailleLofthauteur))+1,
							loft,
							10));
				break;
				
				case 9 :
					neuneus.add(new Cannibale((int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
							(int)(Math.random()*(Saison1.tailleLofthauteur))+1,
							loft,
							10));
				break;
			}
			}
			
			ArrayList<Neuneu> neuneusClones = (ArrayList<Neuneu>) neuneus.clone();
			System.out.println(neuneus.size());
			System.out.println(neuneusClones.size());
			boolean doublon = false;
			
			for(int w=0; w<=neuneus.size()-1 ; w++){
				for(int z=0; z<=neuneusClones.size()-1; z++){
					if(neuneus.get(w).getAbs()==neuneusClones.get(z).getAbs() && neuneus.get(w).getOrdo()==neuneusClones.get(z).getOrdo() && w!=z){
						doublon = true;
						}
				}
				if(doublon==true){ 
					neuneus.remove(w);
					neuneusClones.clear(); 
					neuneusClones = (ArrayList<Neuneu>) neuneus.clone();
					doublon=false;
					System.out.println(neuneus.size());
					System.out.println(neuneusClones.size());
					w-=1;
				}
			}

			System.out.println("hors boucle");	
			neuneusClones.clear();
			System.out.println(neuneus.size());
			System.out.println(neuneusClones.size());
			} 
						
			for (int i=1; i<= Saison1.nombreIngredient;i++){
					ingredient.add(new Viande((int)(Math.random()*(Saison1.tailleLofthauteur))+1,
								(int)(Math.random()*(Saison1.tailleLoftlargeur))+1,
								(int)(Math.random()*10)));
			}	
			
			loft.creationCase();
			loft.visualisation();
			//System.out.println(neuneus.size());
			loft.majCase();
			//System.out.println(neuneus.size());
				
			//neuneus.get(0).seReproduit(neuneus.get(1));
			
			//System.out.println(neuneus.get(0).getLoft().getCases()[1][1]);
			//neuneus.remove(0);
			//System.out.println(neuneus.size());
			//System.out.println(neuneus.get(0));
			//loft.visualisation();
			
			
			int i=0;
			while(i <20){
				
				Reader r = new InputStreamReader(System.in);
				try {
					r.read();
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				
				for (int h=0; h <= neuneus.size()-1 ; h++){
					neuneus.get(h).cycledevie();
					//if(!neuneus.get(h).isExclu()){
						//System.out.println(neuneus.get(h).getEnergie());
						//}
					}
				loft.visualisation();
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
