import java.util.ArrayList;


public class Vorrace extends Erratique{

	public Vorrace(String nom,int ordo,int abs,Loft loft ,int energie,ArrayList<String> nourriture){
		super(nom,ordo,abs,loft,energie,nourriture);
		this.besoin=2;
		}
	
	public void seDeplace(){}
	
	
}
