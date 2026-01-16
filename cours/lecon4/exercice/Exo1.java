package cours.lecon4.exercice;

/*

Exercice 1 : Le Calculateur de Bonus (Niveau Facile)
Objectif : Créer une méthode qui calcule un bonus de fidélité.

La mission : Écris une méthode nommée ajouterBonus.

Entrée : Elle reçoit un double solde.

Logique : Si le solde est supérieur à 5000€, le bonus est de 100€. Sinon, le bonus est de 20€.

Sortie : Elle doit retourner le nouveau solde (solde + bonus).

*/

public class Exo1 {
  
  public static void main (String[] args){
      double monSolde = 5240;
      double newSolde;
      newSolde = ajouterBonus(monSolde);
      
      double bonus = newSolde - monSolde ; 

      System.out.println("Felicitaion vous avez reçu un bonus de: "+ bonus + "\n Votre solde est de: \t\t"+ newSolde);

  }

  public static double ajouterBonus(double solde){
    double bonus = 0;
    if (solde > 5000){
        bonus = 100;
    }else{
        bonus = 20;
    };
    
    solde += bonus; 

    return solde ; 
  }

}
