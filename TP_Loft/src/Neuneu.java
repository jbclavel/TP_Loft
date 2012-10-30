import java.util.ArrayList;


public abstract class Neuneu {

	 protected int abs;
	 protected int ordo;
	 protected boolean exclu;
	 protected Loft loft;
	 protected int energie;
	 	 
	 public abstract void seDeplace();
	 
	 public void mange(Ingredient nourriture){
	 		int hasard =(int)(Math.random()*(nourriture.getEnergie()+1));
	 		this.energie += hasard;
	 		nourriture.setEnergie(nourriture.getEnergie()-hasard);
	 }
	 
	 public Loft getLoft() {
		return loft;
	}

	public abstract void seReproduit(Neuneu a);
	 
	 public boolean estExclu(){ 
		 if(this.energie< Saison1.besoinMin){
			 this.exclu= true;
			 return true; 
		 }else{
			 this.exclu=false;
			 return false;
			 }
	 }
	 
	 public void cycledevie(){
		 //deplacement
		 this.seDeplace();
		 //bouffe
		if(this.loft.getCases()[this.abs-1][this.ordo-1].getRessources()!=null && this.exclu==false){
			if(this.loft.getCases()[this.abs-1][this.ordo-1].getRessources().energie!=0){
		 	this.mange(this.loft.getCases()[this.abs-1][this.ordo-1].getRessources());
		 }
		}
		//baise	
		if (this.loft.getCases()[this.abs-1][this.ordo-1].getNbNeuneu()==1 && this.exclu==false){
		 	this.seReproduit(this.loft.getCases()[this.abs-1][this.ordo-1].getNomNeuneu());
		 	 	}
		//s'exclut 
		this.estExclu();
			
	 }
	 	 
	public int getOrdo() {
		return ordo;
	}

	public void setOrdo(int ordo) {
		this.ordo = ordo;
	}

	public int getAbs() {
		return abs;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public boolean isExclu() {
		return exclu;
	}
	
	

	 
}
