package calculatrice;

import java.util.Scanner;

public class Main {

  // 1.Addition de plusieurs nombre,
      public static double somme (double[] nombres){
        double result = 0;
        for (double nombre: nombres){
          result += nombre;
        }
        System.out.print("la somme est: ");
        return result;
      }

  // 2.Factorielle d'un nombre,
      public static int factorielle(int n){
        int result = 1;
            for(int i = 1; i< n ; i++){
              result *= i; 
            }
            System.out.print("le factorielle de "+ n + " est: "+result);
        return result;
      }

  // 3.Vérifier si nombre premier,
      public static boolean premier(int nbr){
        if (nbr <= 1) return false;
        if (nbr == 2) return true;
        if (nbr % 2 == 0) return false;
        for (int i = 3; i < Math.sqrt(nbr); i += 2){
          if(nbr % i == 0){
            return false;
          }
        }
        return true;
      }

  // Afficher table multiplication
      public static void multiplication(int nbr){
        for(int i = 0; i<= 10 ; i++){
          System.out.println(nbr + " x " +i + " = " + (nbr*i));
        }
      }    

  // Mettre à la puissance,
      public static double puissance(double nbr, int ex){
        return Math.pow(nbr, ex);
      }


  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
          
    System.out.println("Menu:\r\n" + 
            "  1.Addition de plusieurs nombre,\r\n" + 
            "  2.Factorielle d'un nombre,\r\n" + 
            "  3.Vérifier si nombre premier,\r\n" +
            "  4.Afficher table multiplication,\r\n" + 
            "  5.Mettre à la puissance,\r\n" + 
            "  6.Quitter");

    int choix = scanner.nextInt();
      switch(choix){
          case 1:
            System.out.print("vous voulez fair la somme de combien d'élément ?: ");
                int element = scanner.nextInt();
                double[] nombres = new double[element];
                for(int i=0 ; i < nombres.length ; i++){ 
                  System.out.print("Veuillez saisir l'élément "+ (i+1) + " à ajouté: ");
                  nombres[i] = scanner.nextDouble();
                }
                System.out.println(somme(nombres));
              break;
          case 2:
            System.out.print("Veuillez saisir le nombre:  ?: ");
              int factorielleNomber = scanner.nextInt();
              factorielle(factorielleNomber); 
              break;
          case 3: 
            System.out.print("Veuillez saisir le nombre:  ?: ");
            int premierNumber = scanner.nextInt();
            
                if(premier(premierNumber)){
                  System.out.println(premierNumber+" est premier");
                }else {
                  System.out.println(premierNumber+" n'est pas premier");
                }
              break;
          case 4: 
          System.out.println("Veuillez saisir le nombre/chiffre");
          int nbr = scanner.nextInt();
          multiplication(nbr);
              break;
          case 5: 
          System.out.println("Veuillez saisir le nombre/chiffre");
          int puiss = scanner.nextInt();
          System.out.println("Veuillez saisir la puissance n");
          int n = scanner.nextInt();
               System.out.println(puiss +" a la puissanse "+ n + " = "+ puissance(puiss, n));
            
              break;
          case 6: 
            System.out.println("Aurevoir à bientôt ------- Fin du programme ------");
              break;
          default: 
              System.out.print("Choix non disponible. Veuillez réessayer: ");
              break;
      }
       
    scanner.close();
  }
}