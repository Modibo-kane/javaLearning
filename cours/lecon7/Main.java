package cours.lecon7;

public class Main {
  public static void main(String[] args){
    
    CompteBancaire[] mesCompte = { 
        new CompteBancaire("Modibo", 50000),
        new CompteEpargne("Boubacar Kane", 2000, 100000),
        new CompteEpargne("Oumar", 5000, 10000)
    };
    // polymorphisme: Ici je mélange des comptes bancaire et compte epargne dans un même tableau de types CompteBancaire mais java est assé intelligent pour les differentier et me permettre d'utiliser les methodes commun au deux differents types de comptes

    for(int i = 0; i < mesCompte.length; i++){
      // System.out.println(mesCompte[i].toString());
      if (mesCompte[i] instanceof CompteEpargne){
        CompteEpargne epargne = (CompteEpargne) mesCompte[i];
        epargne.deposer(1000);

        // Le casting: ici vue que mon tableau mesComptes est un polymorphe et que la methode que e veux appliqué n'existe que chez l'enfant je suis obligé de verifier avec "instanceof" si un element est du type de l'enfant  
      }

      mesCompte[i].calculerInteret(0.05);
    }


  }
}
