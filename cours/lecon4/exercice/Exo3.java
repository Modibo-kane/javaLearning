package cours.lecon4.exercice;

/*
Exercice 3 : Le Mini-Banquier (Niveau Expert)
Objectif : Combiner tout ce qu'on a appris.

Écris un programme complet avec une méthode simulerMois.

Le tableau : Crée un tableau avec les dépenses prévues d'un client : {50.0, 1200.0, 30.0, 45.0, 80.0}.

La méthode : La méthode simulerMois doit :

Prendre le solde et le tableau en paramètres.

Soustraire chaque dépense du solde.

MAIS si une dépense rend le solde négatif, elle doit l'ignorer, afficher "Paiement refusé" et passer à la suivante.

À la fin, elle retourne le solde final.

*/

public class Exo3 {
  public static void main( String[] args){
      double tab[] = {50.0, 1200.0, 30.0, 45.0, 80.0};

      double simuler = simulerMois(200, tab);

      System.out.println(simuler);

  }

  public static double simulerMois(double solde, double[] transaction){
    
    for(int i = 0; i < transaction.length; i++){
      if (transaction[i] > solde){
          System.out.println("Paiement refusé \n Solde: "+ solde + "\t transaction: "+ transaction[i]);
          continue;
      }
      solde -= transaction[i];
    }

    return solde;
  }
}
