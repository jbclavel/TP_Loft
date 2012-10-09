import java.util.ArrayList;


public abstract class Neuneu {

	 protected int besoin;
	 protected String nom;
	 protected int ordo;
	 protected int abs;
	 protected Loft loft;
	 protected int energie;
	 protected ArrayList<String> nourriture ;
	 
	  
	 public abstract void seDeplace();
	 public abstract void mange();
	 public abstract void seReproduit(Neuneu a);
	 public boolean estExclu(){ 
		 if(this.energie< this.besoin){
			return true; 
		 }else{
			 return false;
			 }
	 }
	 
	 public void cycledevie(){
		 this.seDeplace();
		 this.mange();
		 
	/*	if (this.loft.getCases()[this.abs][this.ordo].getNbNeuneu()=1){
			 seReproduit((Neuneu) this.loft.getCases()[this.abs][this.ordo].getNomNeuneu());
		 }*/
		 
				
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

	public int getBesoin() {
		return besoin;
	}

	public ArrayList<String> getNourriture() {
		return nourriture;
	}
	 
}
