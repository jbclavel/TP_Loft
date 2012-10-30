import java.util.ArrayList;


public class Loft {
	
	private int hauteur;
	private int largeur;
	private static Case[][] cases;
	public static ArrayList<Neuneu> neuneus;
	private static ArrayList<Ingredient> ingredient;
	
	
	
	public Loft(int a, int b, ArrayList<Neuneu> c, ArrayList<Ingredient> d){
		this.largeur = a;
		this.hauteur = b;
		cases = new Case[largeur][hauteur];
		neuneus=c;
		ingredient=d;
	}
	
	
	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		Loft.cases = cases;
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}
	
	public void visualisation(){
		for (int i=1; i<= Saison1.tailleLoftlargeur;i++){
			System.out.print("    " + i);
		}
		System.out.print("\n");
	
		boolean presence=false;
		boolean presenceIngredient=false;
		String classe = "";
	
	for (int i=1; i<= Saison1.tailleLofthauteur ; i++){
		System.out.print("\n"+ i+"  ");
		for (int j=1; j<= Saison1.tailleLoftlargeur ; j++){
			//presence lofteur
			for (int h=0; h <= neuneus.size()-1 ; h++){
				if (neuneus.get(h).getOrdo()==i && neuneus.get(h).getAbs()==j){
					presence = true;
					classe = neuneus.get(h).getClass().getName();
				}
			}
			//presence ingredient
			for (int k=0; k <= Saison1.nombreIngredient-1 ; k++){
				if (ingredient.get(k).getOrdo()==i && ingredient.get(k).getAbs()==j && ingredient.get(k).getEnergie() != 0){
					presenceIngredient = true;
				}
			}

			if (presence==true && presenceIngredient==true){
				switch(classe){
				 	case "Erratique":
				 		System.out.print("|E.I ");
				 		break;
				 	case "Lapin" :
				 		System.out.print("|L.I ");
				 		break;
				 	case "Cannibale" :
				 		System.out.print("|C.I ");
				 		break;
				 	case "Vorrace" :
				 		System.out.print("|V.I ");
				 		break;
					}
				presence = false;
				presenceIngredient = false;
				classe= " ";
				}else if(presence==true && presenceIngredient==false){
					switch(classe){
				 		case "Erratique":
				 			System.out.print("|E.- ");
				 			break;
				 		case "Lapin" :
				 			System.out.print("|L.- ");
				 			break;
				 		case "Cannibale" :
				 			System.out.print("|C.- ");
				 			break;
				 		case "Vorrace" :
				 			System.out.print("|V.- ");
				 			break;
						}
					presence = false;
					classe = "";
					}else if(presence==false && presenceIngredient==true){							
						System.out.print("|0.I ");
						presenceIngredient= false;
						}else if(presence==false && presenceIngredient==false){							
							System.out.print("|0.- ");
						}
			}
	}


/*
	for (int p=0; p <= Saison1.nombreLofteurs-1 ; p++){
		System.out.println(neuneus.get(p).getAbs() +" "+ neuneus.get(p).getOrdo());
		}
	
	for (int m=0; m <= Saison1.nombreIngredient-1 ; m++){
		System.out.println(ingredient.get(m).getAbs() +" "+ ingredient.get(m).getOrdo());
		}*/
	}
	
	
	public void creationCase(){	
		for (int i=0; i< Saison1.tailleLofthauteur ; i++){
			for (int j=0; j< Saison1.tailleLoftlargeur ; j++){
			//presence lofteur
				Loft.cases[j][i]=new Case(j,i);
			}
		}
	}
	
			public void majCase(){
				//suppression des neuneus mort 
				for(int u=0; u<= neuneus.size()-1 ; u++){
					if(Loft.neuneus.get(u).estExclu()){
						Loft.neuneus.remove(u);
						u-=1;
					}
				}
				
				//supression des neuneus dans les cases
				for (int i=1; i<= Saison1.tailleLofthauteur ; i++){
					for (int j=1; j<= Saison1.tailleLoftlargeur ; j++){
						neuneus.get(0).getLoft().getCases()[j-1][i-1].getPersonnes().clear();
					}
				}
				
				//mets les neuneus et les ingredients dans les cases
				for (int i=1; i<= Saison1.tailleLofthauteur ; i++){
					for (int j=1; j<= Saison1.tailleLoftlargeur ; j++){
					//presence lofteur
						for (int h=0; h <= neuneus.size()-1 ; h++){
							if (neuneus.get(h).getOrdo()==i && neuneus.get(h).getAbs()==j){
								neuneus.get(0).getLoft().getCases()[j-1][i-1].ajoutNeuneu(neuneus.get(h));					
							}
						}
					//presence ingredient
						for (int k=0; k <= Saison1.nombreIngredient-1 ; k++){
							if (ingredient.get(k).getOrdo()==i && ingredient.get(k).getAbs()==j){
								neuneus.get(0).getLoft().getCases()[j-1][i-1].ajoutRessource(ingredient.get(k));
							}
						}
					}
				}
			}
			
		
							/*
			//}
			//presence ingredient
			for (int k=0; k <= Saison1.nombreIngredient-1 ; k++){
				if (ingredient.get(k).getOrdo()==i && ingredient.get(k).getAbs()==j){
					Neuneu a = neuneus.get(0);
					Case b= a.getLoft().getCases()[j][i];
					System.out.println(b);
					b.ajoutRessource(ingredient.get(k));
					Ingredient f = ingredient.get(k);
				}
			}
*/
	
	}
	
	
	
	
	
	
	
	

