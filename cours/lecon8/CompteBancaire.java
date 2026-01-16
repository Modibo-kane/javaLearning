package  cours.lecon8;

public class CompteBancaire {

  private String titulaire;
  protected double solde;
   

  public CompteBancaire (String name, double solde){
    this.solde = solde;
    this.titulaire = name;
  }

  public void virementVers(CompteBancaire compte, double montant){
      if (this.solde < montant){
        // System.out.println("\n Retrait échoué :  Solde insuffisant\n");
        throw new RuntimeException("Retrait échoué :  Solde insuffisant");
      }else if (montant < 0){
          throw new IllegalArgumentException("Le montant ne peut pas être négative");
      }else{
          // on retire le montant du compte de l'expediteur
          this.solde -= montant;          

          // on ajout le montant au compte du receveur
          compte.solde += montant;

          System.out.println("\nTransfer effectuer avec succès \n Vous avez envoyer: "+ montant +"$ à  "+compte.titulaire+ "\n Votre solde est de: "+ this.solde);
      }
  }

  public void calculerInteret(double taux){
    double montantInteret ;
      if (taux  <= 0){
        System.out.println("Erreur veuillez verifier le taux que vous avez saisi");
      }else {
        montantInteret= (this.solde * taux ); // je suis pas sur si c'est comme ça qu'on calcule le motant des intererts 
        this.solde  = this.solde + montantInteret;
       

        System.out.print("\nVous avez: "+ montantInteret + "$ d'intérêt \n votre solde est: "+ this.solde +"$\n");

      }
  }


  public double getSolde(){
    return this.solde;
  }
  public String getName(){
    return this.titulaire;
  }


  public void setTitulaire(String newName){
    if(!newName.isEmpty()){
        this.titulaire = newName;
    }
  }

  public String toString(){
      return "Compte de "+ this.titulaire + " | Solde: "+ this.solde + "$";
  };

  public void tenterRetrait(double montant){
    if(montant < 0){
      throw new IllegalArgumentException("Le montant ne peut pas être négative"); 
    }

    if (montant >this.solde){
      throw new RuntimeException( "Votre solde est insuffisant pour ce retrait");
    }

    this.solde -= montant;
  }
  
} 