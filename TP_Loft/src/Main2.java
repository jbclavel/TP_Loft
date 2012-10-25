	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Loft loft = new Loft(tailleLofthauteur,tailleLoftlargeur);
		//loft.remplissageAleatoire(0.1f);
		
		for (int i=1; i< Saison1.nombreLofteurs;i++){
				new Erratique((int)(Math.random()*(Saison1.tailleLofthauteur)),
						(int)(Math.random()*(Saison1.tailleLoftlargeur)),
						loft,
						10);
		}
		
		
		for (int i=1; i< Saison1.nombreIngredeient;i++){
			new Viande((int)(Math.random()*10));
		}	
		
		System.out.println(loft1.getHauteur()+";"+loft1.getLargeur());
		System.out.println(loft1.getCases()[0][0].getNomNeuneu());

			}
	
}
