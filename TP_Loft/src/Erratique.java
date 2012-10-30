public class Erratique extends Neuneu {

	public Erratique(int c, int d, Loft e, int f){
		 this.abs=c;
		 this.ordo=d;
		 this.loft=e;
		 this.energie=f;
	} 
	
	public void seDeplace(){
		
		int absMem = abs;
		int ordoMem = ordo;
		
		int deDeplacement = (int)(Math.random()*4);
		int deDeplMem = deDeplacement;
		boolean prem = true;
		
		while(prem== true || (deDeplacement != deDeplMem && deDeplacement!=4 && deDeplacement!=10) ){
		
			prem = false ;
			
		switch (deDeplacement) {
		//droite		
		case 0 :
			//System.out.println("case0"+ deDeplacement + "."+ deDeplMem);
			if(this.abs==Saison1.tailleLoftlargeur && this.loft.getCases()[this.abs-2][this.ordo-1].getNbNeuneu()<2){
				this.abs -=1;
				deDeplacement=10;
				}else if(this.abs!=Saison1.tailleLoftlargeur && this.loft.getCases()[this.abs][this.ordo-1].getNbNeuneu()<2){
					this.abs+=1;
					deDeplacement=10;
					}else{
						deDeplacement=2;
						//System.out.println("pas depl");
					}
			break;
			
		//gauche
		case 1 :
			//System.out.println("case1" + deDeplacement + "."+ deDeplMem);
			if(this.abs==1 && this.loft.getCases()[this.abs][this.ordo-1].getNbNeuneu()<2){
				this.abs+=1;
				deDeplacement=10;
				}else if(this.abs!=1 && this.loft.getCases()[this.abs-2][this.ordo-1].getNbNeuneu()<2){
					this.abs-=1;
					deDeplacement=10;
					}else{
						deDeplacement=3;
				//		System.out.println("pas depl1");
					}
			break;
		//haut
		case 2 :
			//System.out.println("case2"+ deDeplacement+ "."+ deDeplMem);
			if(this.ordo==1 && this.loft.getCases()[this.abs-1][this.ordo].getNbNeuneu()<2){
				this.ordo+=1;
				deDeplacement=10;
				}else if(this.ordo!=1 && this.loft.getCases()[this.abs-1][this.ordo-2].getNbNeuneu()<2){
					this.ordo-=1;
					deDeplacement=10;
					}else{
						deDeplacement=1;
				//		System.out.println("pas depl2");
					}
			break;
		//bas
		case 3 :
			//System.out.println("case3"+ deDeplacement + "."+ deDeplMem);
			if(this.ordo==Saison1.tailleLofthauteur && this.loft.getCases()[this.abs-1][this.ordo-2].getNbNeuneu()<2){
				this.ordo-=1;
				deDeplacement=10;
			}else if(this.ordo!=Saison1.tailleLofthauteur && this.loft.getCases()[this.abs-1][this.ordo].getNbNeuneu()<2){
				this.ordo+=1;
				deDeplacement=10;
				}else{
					deDeplacement=4;
				//	System.out.println("pas depl3");				
				}
			break;
		}
		}
		
		if(deDeplacement==4){
			if(this.abs==Saison1.tailleLoftlargeur && this.loft.getCases()[this.abs-2][this.ordo-1].getNbNeuneu()<2){
				this.abs -=1;
				deDeplacement=10;
				}else if(this.abs!=Saison1.tailleLoftlargeur && this.loft.getCases()[this.abs][this.ordo-1].getNbNeuneu()<2){
					this.abs+=1;
					deDeplacement=10;
				}else{			
					System.out.println("pas depl4");
					this.exclu=true;		
				}
		}
	
		//maj case
		if(deDeplacement==10){
			//on efface les neuneus de la case avant le deplacement
			this.loft.getCases()[absMem-1][ordoMem-1].getPersonnes().clear();
			//on remets les neuneus qui n'ont pas bougé
			for (int h=0; h <= Loft.neuneus.size()-1 ; h++){
				if (Loft.neuneus.get(h).getOrdo()==ordoMem && Loft.neuneus.get(h).getAbs()==absMem){
					Loft.neuneus.get(0).getLoft().getCases()[absMem-1][ordoMem-1].ajoutNeuneu(Loft.neuneus.get(h));					
				}
			}
			
		}
		
	}
		
	
	public void seReproduit(Neuneu a){
		Loft.neuneus.add(new Erratique(this.abs,this.ordo,this.loft,10));
		a.setEnergie(getEnergie()-5);
		this.energie-=5;
		a.estExclu();
		//this.loft.getCases()[this.abs-1][this.ordo-1].ajoutNeuneu(new Erratique(this.abs,this.ordo,this.loft,10));
		  }
	
	
	
}
