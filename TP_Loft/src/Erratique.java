import java.util.ArrayList;


public class Erratique extends Neuneu {

	public Erratique(int c, int d, Loft e, int f){
		 this.ordo=c;
		 this.abs=d;
		 this.loft=e;
		 this.energie=f;
		 
	 } 
	
	
	
	
	public void seDeplace(){
		int deDeplacement = (int)(Math.random()*3);
		
		switch (deDeplacement) {
		//droite		
		case 0 :
			if(this.abs!=Saison1.tailleLoftlargeur){
			this.abs +=1;
			}else{
				deDeplacement+=1;
				}
			break;
			
		//gauche
		case 1 :
			this.abs-=1;
			break;
		//haut
		case 2 :
			this.ordo+=1;
			break;
		//bas
		case 3 :
			this.ordo-=1;
			break;

		}
	}
	
	public void seReproduit(Neuneu a){
		 this.loft.getCases()[this.abs][this.ordo].ajoutNeuneu(new Erratique(this.abs,this.ordo,this.loft,10));
		 	 }
	
	
	
}
