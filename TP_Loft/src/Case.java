import java.util.ArrayList;


public class Case {
	
	private int abs;
	private int ordo;
	protected Loft loft;
	private Ingredient ressources;
	private ArrayList<Neuneu> personnes;
	
	public Case(int a, int b){
		this.abs=a;
		this.ordo=b;
		this.personnes = new ArrayList<Neuneu>();
	}
	
	public void ajoutRessource(Ingredient a){
		this.ressources= a ;
	}
	
	public void ajoutNeuneu(Neuneu a){
		personnes.add(a);
		}
	
	public int getNbNeuneu(){
		return personnes.size();
	}
	
	public Neuneu getNomNeuneu(){
		return personnes.get(0);
	}
	
	
	public int getAbs() {
		return abs;
	}
	
	public int getOrdo() {
		return ordo;
	}
	
	public Ingredient getRessources() {
		return ressources;
	}
	
}
