import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Neuneu> neuneus = new ArrayList<Neuneu>();
		ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
		Loft loft = new Loft(Saison1.tailleLofthauteur,Saison1.tailleLoftlargeur,neuneus, ingredient);
			//loft.remplissageAleatoire(0.1f);
				
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
			
			
			for (int i=1; i<= Saison1.tailleLoftlargeur;i++){
				System.out.print("    " + i);
			}
			System.out.print("\n");
			
			boolean presence=false;
			boolean presenceIngredient=false;
			
			for (int i=1; i<= Saison1.tailleLofthauteur ; i++){
				System.out.print("\n"+ i+"  ");
				for (int j=1; j<= Saison1.tailleLoftlargeur ; j++){
					//presence lofteur
					for (int h=0; h <= Saison1.nombreLofteurs-1 ; h++){
						if (neuneus.get(h).getOrdo()==i && neuneus.get(h).getAbs()==j){
							presence = true;
						}
					}
					//presence ingredient
					for (int k=0; k <= Saison1.nombreIngredient-1 ; k++){
						if (ingredient.get(k).getOrdo()==i && ingredient.get(k).getAbs()==j){
							presenceIngredient = true;
						}
					}

					if (presence==true && presenceIngredient==true){
						System.out.print("|E.I ");
						presence = false;
						presenceIngredient = false;
						}else if(presence==true && presenceIngredient==false){
							System.out.print("|E.- ");
							presence = false;
							}else if(presence==false && presenceIngredient==true){							
								System.out.print("|0.I ");
								presenceIngredient= false;
								}else if(presence==false && presenceIngredient==false){							
									System.out.print("|0.- ");
								}
					}
			}
	

	
			for (int p=0; p <= Saison1.nombreLofteurs-1 ; p++){
				System.out.println(neuneus.get(p).getAbs() +" "+ neuneus.get(p).getOrdo());
				}
			
			for (int m=0; m <= Saison1.nombreIngredient-1 ; m++){
				System.out.println(ingredient.get(m).getAbs() +" "+ ingredient.get(m).getOrdo());
				}
	}
}
/*	public static void main(String[] args) {
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
