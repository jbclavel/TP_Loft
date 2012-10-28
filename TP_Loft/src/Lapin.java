public class Lapin extends Neuneu{

	public Lapin(int c, int d, Loft e, int f){
		 this.ordo=c;
		 this.abs=d;
		 this.loft=e;
		 this.energie=f;
		 } 
	
	//a definir
	public void seDeplace(){}

	public void seReproduit(Neuneu a){
		Loft.neuneus.add(new Erratique(this.abs,this.ordo,this.loft,10));
		a.setEnergie(getEnergie()-5);
		this.energie-=5;
		a.isExclu();
	}
}
