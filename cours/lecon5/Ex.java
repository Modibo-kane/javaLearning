package cours.lecon5;

public class Ex {
  public static void main( String[] args){

      // 1. On crée l'objet (on instancie)
        CompteBancaire monCompte = new CompteBancaire("Jean Dupont", 500.0);
        

        // On creer un deuxieme compte 

        CompteBancaire monCompt2 = new CompteBancaire("Modibo Kane", 452.99);

        monCompte.virementVers(monCompt2, 140);
        monCompte.virementVers(monCompt2, 360);


        // 3. Tes dépenses de l'exercice précédent
        // double[] depenses = {50.0, 1200.0, 30.0, 45.0};

        // System.out.println("--- Début des opérations ---");
        // monCompte.afficherInfos();

        // 4. On utilise l'objet dans la boucle
        // for (double d : depenses) {
        //     monCompte.tenterRetrait(d);
        // }

        // System.out.println("--- Fin du mois ---");
        // monCompte.afficherInfos();



  }
}
