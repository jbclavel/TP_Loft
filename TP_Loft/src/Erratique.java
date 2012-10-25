import java.util.ArrayList;


public class Erratique extends Neuneu {

	public Erratique(int c, int d, Loft e, int f){
		 this.ordo=c;
		 this.abs=d;
		 this.loft=e;
		 this.energie=f;
		 
	 } 
	
	
		
	public void seDeplace(){}
	
	public void seReproduit(Neuneu a){
		 this.loft.getCases()[this.abs][this.ordo].ajoutNeuneu(new Erratique(this.abs,this.ordo,this.loft,10));
		 	 }
	
	
	
}
