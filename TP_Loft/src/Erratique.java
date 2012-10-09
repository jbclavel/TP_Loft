import java.util.ArrayList;


public class Erratique extends Neuneu {

	public Erratique(int a, String b, int c, int d, Loft e, int f, ArrayList<String> g){
		 this.besoin=a;
		 this.nom=b;
		 this.ordo=c;
		 this.abs=d;
		 this.loft=e;
		 this.energie=f;
		 this.nourriture=g;
	 } 
	
	
	public void seReproduit(Neuneu a){
		 this.energie=this.energie-5;
		 a.energie=a.energie-5;
		 
	 }
	
	public void mange(){}
	public void seDeplace(){}
	
	
}
