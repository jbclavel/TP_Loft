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
		// if this.seReproduit(?????);
	 }
	 
}
