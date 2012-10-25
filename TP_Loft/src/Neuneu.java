import java.util.ArrayList;


public abstract class Neuneu {

	 protected int abs;
	 protected int ordo;
	 protected boolean exclu;
	 protected Loft loft;
	 protected int energie;
	 	 
	 public abstract void seDeplace();
	 
	 public void mange(Ingredient nourriture){
	 		this.energie += nourriture.getEnergie();
	 }
	 
	 public abstract void seReproduit(Neuneu a);
	 
	 public boolean estExclu(){ 
		 if(this.energie< 2){
			return true; 
		 }else{
			 return false;
			 }
	 }
	 
	 public void cycledevie(){
		 this.seDeplace();
		 
		 if(this.loft.getCases()[this.abs][this.ordo].getRessources()!=null){
			 this.mange(this.loft.getCases()[this.abs][this.ordo].getRessources());
		 }
		 
		 if (this.loft.getCases()[this.abs][this.ordo].getNbNeuneu()==1){
		 	this.seReproduit(this.loft.getCases()[this.abs][this.ordo].getNomNeuneu());
		 	 	}
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

	 
}
