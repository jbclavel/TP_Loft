public class Vorrace extends Erratique{
	public Vorrace(int ordo,int abs,Loft loft ,int energie){
		super(ordo,abs,loft,energie);
		}
	
	// se deplace vers de la bouffe
	//public void seDeplace(){}
	
	public void seReproduit(Neuneu a){
		Loft.neuneus.add(new Vorrace(this.abs,this.ordo,this.loft,10));
		a.setEnergie(getEnergie()-5);
		this.energie-=5;
		a.estExclu();
	}
}
