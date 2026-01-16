package gestionNotes;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    
      Scanner scanner = new Scanner(System.in);

      System.out.println(" ..: Début du Programme :..");
      
      System.out.print("Veuillez saisir le nombre d'élève: ");

      //1.Demander un taille de tableau,
      int pupilCount = scanner.nextInt();

      // 2.Créer un tableau de cette taille
      double[] notes = new double[pupilCount];

      // 3.Remplir le tableaude notes,
      double demande = 0.0; 

      for(int i=0; i < pupilCount ; i++){
        System.out.print("Veuillez saisir la note "+ (i+1) + ": ");
        demande = scanner.nextDouble();
        notes[i] = demande;
      }


      // 4.Calculer et afficher la moyenne
      double moyenne =0.0;
      for(double note: notes){
        moyenne+= note;
      }
      System.err.println("La moyenne de la classe est: "+ (moyenne/pupilCount));

      // 5.Trouver et afficher:
      double min = notes[0];
          double max = notes[0];
          for (double note: notes){
            if(min > note){
              min = note;
            }else if (max < note){
              max = note;
            }
          }
          // - La plus petite note,
          System.err.println("la plus petite note est: "+ min);

          // - La plus Grande note
          System.out.println("La plus grande est: "+ max);
      
      scanner.close();

  }
}
