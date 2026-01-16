package cours.lecon2.exercice;

public class Exo2 {
  public static void main( String[] args){
    double solde = 10000.00;
    double montantRetirer = 1000.00;

    for (int i = 0; i < 15 ; i++){
      System.out.println("Tentaive N°: "+ (i+1));

      if(solde >= montantRetirer){
        solde -= montantRetirer;

        System.out.println("Retrait éffectué :  Solde resttant ----> "+ solde);
        if (solde == 0){
        System.out.println(" Attention votre solde est actullement égale à 0:  Solde insuffisant\\n" + " solde actuelle ----> "+ solde);
        break ;
      }
      }
      else{
        System.out.println("Retrait échoué:  Solde insuffisant\n solde actuelle ----> "+ solde);
        break ;
      }
    }
  }
}
