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

	
	
	
	
	


}
