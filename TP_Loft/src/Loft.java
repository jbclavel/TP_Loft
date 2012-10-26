import java.util.ArrayList;


public class Loft {
	
	private int hauteur;
	private int largeur;
	private static Case[][] cases;
	private static ArrayList<Neuneu> neuneus;
	private static ArrayList<Ingredient> ingredient;
	
	
	
	public Loft(int a, int b, ArrayList<Neuneu> c, ArrayList<Ingredient> d){
		this.hauteur = a;
		this.largeur = b;
		setCases(new Case[hauteur][largeur]);
		this.neuneus=c;
		this.ingredient=d;
	}
	
	
	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
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
	
	for (int i=1; i<= Saison1.tailleLofthauteur ; i++){
		System.out.print("\n"+ i+"  ");
		for (int j=1; j<= Saison1.tailleLoftlargeur ; j++){
			//presence lofteur
			for (int h=0; h <= Saison1.nombreLofteurs-1 ; h++){
				if (this.neuneus.get(h).getOrdo()==i && this.neuneus.get(h).getAbs()==j){
					presence = true;
				}
			}
			//presence ingredient
			for (int k=0; k <= Saison1.nombreIngredient-1 ; k++){
				if (this.ingredient.get(k).getOrdo()==i && this.ingredient.get(k).getAbs()==j){
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


/*
	for (int p=0; p <= Saison1.nombreLofteurs-1 ; p++){
		System.out.println(neuneus.get(p).getAbs() +" "+ neuneus.get(p).getOrdo());
		}
	
	for (int m=0; m <= Saison1.nombreIngredient-1 ; m++){
		System.out.println(ingredient.get(m).getAbs() +" "+ ingredient.get(m).getOrdo());
		}*/
	}
	}

