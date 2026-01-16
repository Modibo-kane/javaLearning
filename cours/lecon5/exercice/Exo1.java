package cours.lecon5.exercice;

/*
Exercice 1 : Le Constructeur et la Simplification
Objectif : Remplacer les assignations manuelles par un constructeur.

Dans ta classe CompteBancaire, crée un constructeur qui prend deux paramètres : le nom du titulaire et le solde de départ.

Utilise le mot-clé this à l'intérieur pour éviter les confusions de noms.

Dans ton main : Réécris la création de tes deux comptes (monCompte et monCompt2) pour qu'ils soient créés sur une seule ligne chacun.
*/

public class Exo1 {
  public String titulaire;
  public double solde;
  public int nbTransactionsSuccess = 0; 

  public Exo1(String name, double initialSold){
    this.titulaire = name;
    this.solde = initialSold;
  }

  public void afficherInfos(){
    System.out.println("\nCompte de: "+ this.titulaire + "\t solde: "+this.solde);
  }

  public void virementVers(Exo1 compte, double montant){
      if (this.solde < montant){
        System.out.println("\n Retrait échoué :  Solde insuffisant\n");
      }else{
          // on retire le montant du compte de l'expediteur
          this.solde -= montant;

          // incrémenter le nbTransactionsSuccess
          nbTransactionsSuccess++;

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
        montantInteret= (this.solde * taux ) - this.solde ; // je suis pas sur si c'est comme ça qu'on calcule le motant des intererts 
        this.solde  *= taux;

        System.out.print("\nVous avez: "+ montantInteret + "$ d'intérêt \n votre solde est: "+ this.solde +"$\n");

      }
  }

}


