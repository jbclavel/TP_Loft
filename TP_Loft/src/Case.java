import java.util.ArrayList;


public class Case {
	
	private int abs;
	private int ordo;
	private ArrayList<Ingredient> ressources;
	private ArrayList<Neuneu> personnes;
	
	public Case(int a, int b, ArrayList<Ingredient> ressource){
		this.abs=a;
		this.ordo=b;
		this.ressources=ressource;
	}
	
	public void ajoutRessource(Ingredient a){
		this.ressources.add(a);
	}
	
	public void ajoutNeuneu(Neuneu a){
		personnes.add(a);
		}
	
	public boolean getNbNeuneu(){
		if (personnes.size() > 1){
			return false;
		}else{
			return true;
		}
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
