package cours.lecon4.exercice;

/*

Exercice 2 : Le Filtre de Sécurité (Niveau Moyen)
Objectif : Utiliser une boucle et un tableau pour valider des transactions.

La mission : Tu as un tableau de montants de retraits. Tu dois créer une méthode compterAlertes qui compte combien de retraits sont suspects.

Entrée : Un tableau double[] transactions.

Logique : Un retrait est "suspect" s'il est supérieur à 400€.

Sortie : La méthode doit retourner le nombre de suspects (un entier int).

*/

public class Exo2 {
  public static void main (String[] args){
      double tabRetrait[] = {500.57, 122, 826, 905, 61.99, 87, 650, 45, 22.56, 842.0, 645, 42};

      int alert = compterAlertes(tabRetrait);

      System.out.println("il y a eu: "+alert+" retraits suspectes");
  }

  public static int compterAlertes(double[] transactions) {
      int compteur = 0;

      for(int i= 0; i < transactions.length; i++){
        if (transactions[i] > 400){
          compteur++;
        }
      }

      return compteur;
  }
}
