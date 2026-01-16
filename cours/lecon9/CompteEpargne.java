package cours.lecon9;

public class CompteEpargne extends CompteBancaire implements Parrainable{
  private double plafond;

  // ajout de la methode abstraite 
  public  void afficherTypeCompte(){
    System.out.println("ceci est un compte épargne ");
  }

  // ajout de la methode Interface
  @Override
  public void genererCodeParrainage(){
    System.out.println("Code gérnéré pour  " + getName() + "  PARRAIN-2026");
  }  

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
