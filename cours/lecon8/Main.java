package cours.lecon8;

public class Main {
  public static void main(String[] args){
    CompteBancaire monCompte = new CompteBancaire("Modibo Kane", 500);
    CompteBancaire sonCompte = new CompteBancaire("Rachid Ali Omar", 0);
    try {
      monCompte.virementVers(sonCompte, -1);
    }catch (RuntimeException e){
      System.err.println("erreur: " + e.getMessage());
    }
  }
}
