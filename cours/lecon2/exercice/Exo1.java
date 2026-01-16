package cours.lecon2.exercice;

public class Exo1 {
  public static void main (String[] args){
      double solde = 100.0; 
      double montantRetrait = 30.0;
      double newSolde = 0;
      

      boolean isPermit = false;

      //  if (solde >= montantRetrait){
      //     isPermit = true;
      //  }

      isPermit = (solde >= montantRetrait);

     if (isPermit){
        newSolde = solde - montantRetrait;
        System.out.println("Nouveau solde est :  "+ newSolde +" Rerait autorisé: "+ isPermit);
     } else {  
        newSolde = solde;
        System.out.println("solde insufisant");
      }

     
  }
}
