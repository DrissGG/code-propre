package ex2;

public class LivretA extends CompteBancaire {
	private double tauxRemuneration;
	
	/** solde : solde du compte */
	private double solde;

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
	}
	
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde() -tauxRemuneration/100);
		}
	
	
	@Override
	public void debiterMontant(double montant) {
	    if (getSolde()- montant > 0) {
	        this.solde -= montant;
	    }
	}

}
