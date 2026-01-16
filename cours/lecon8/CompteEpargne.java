package cours.lecon8;

public class CompteEpargne extends CompteBancaire{
  private double plafond;

  //j'appelle le constructeur 

  public CompteEpargne(String titulaire, double newSolde, double fond){
    
    // je renseigne les infos du constructeur du parent 
    super(titulaire, newSolde);

    this.plafond = fond;
  }

  public void deposer(double montant){
    if ( (this.solde + montant) <= this.plafond ){
        this.solde += montant;
        System.out.println("Dépôt réussi. Nouveau solde : " + this.solde + "$" + "\tCompte de:  "+ getName()); 
    }else {
            System.out.println("Dépôt refusé : Le plafond de " + plafond + "$ serait dépassé.");
        }
  };

  public String toString(){
    return super.toString()+ " [ Plafond:   " + plafond +"$ ]";
  };

}