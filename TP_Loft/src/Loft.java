import java.util.ArrayList;


public class Loft {
	
	private int hauteur;
	private int largeur;
	private Case[][] cases;
	private ArrayList<Neuneu> neuneus;
	
	public Loft(int a, int b){
		this.hauteur = a;
		this.largeur = b;
		setCases(new Case[hauteur+1][largeur+1]);
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
