package cours.lecon9;

import java.util.ArrayList;

public class Main {
  public static void main (String[] args){
    CompteBancaire monCompte = new CompteEpargne("Modibo Kane", 500, 5000);

    Parrainable p = new CompteEpargne("Tonton", 700, 5000);

    // p.genererCodeParrainage();
    // monCompte.afficherTypeCompte();

    // creer une liste

    ArrayList<CompteBancaire> maListe = new ArrayList<>();

    maListe.add(new CompteEpargne("Modibo", 5000, 50000));
    maListe.add(new CompteEpargne("Rachide", 4000, 40000));
    maListe.add(new CompteEpargne("Telly", 6000, 60000));

    for (CompteBancaire c : maListe){
      System.out.println(c);
    }
    System.out.println("-------Fin de la serie-----");

    maListe.remove(1);
  }

  
}
