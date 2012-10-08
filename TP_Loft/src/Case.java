import java.util.ArrayList;


public class Case {
	
	private int abs;
	private int ordo;
	private ArrayList<Ingredient> ressources;
	private ArrayList<Neuneu> personnes;
	
	public Case(int a, int b, ArrayList<Ingredient> c, ArrayList<Neuneu> d){
		this.abs=a;
		this.ordo=b;
		this.ressources=c;
		this.personnes=d;
	}
	
	public void ajoutRessource(Ingredient a){
		this.ressources.add(a);
	}
	
	public void ajoutNeuneu(Neuneu a){
		personnes.add(a);
		}
	
	public int getNbNeuneu(){
		return personnes.size();
	}
	
	public String getNomNeuneu(){
		return personnes.get(0).nom;
	}
	
	
	public int getAbs() {
		return abs;
	}
	
	public int getOrdo() {
		return ordo;
	}
	
	public ArrayList<Ingredient> getRessources() {
		return ressources;
	}
	
}
