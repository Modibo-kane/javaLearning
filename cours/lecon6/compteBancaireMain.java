package cours.lecon6;

public class compteBancaireMain {
  public static void main(String[] args){
    compteBancaire compte1 = new compteBancaire("Modibo Kane",5245);
    compteBancaire compte2 = new compteBancaire("Oumar Diallo",6785);


    // System.out.println(compte1.getSolde());
    compte1.setTitulaire("Jule Ba");
    // System.out.println(compte1.getName());

    compte1.virementVers(compte2, 50);
    // System.out.println(compte2.getSolde());

    compte1.calculerInteret(0.5);

    CompteEpargne compte3 = new CompteEpargne("Yaya Diallo", 5245.2, 50000);
    
    System.out.println(compte3);
    System.out.println(compte1);
    System.out.println(compte2);

  }
}
