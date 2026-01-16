package calculateurNote;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    // recuperer les données:

        // le nom: 
        System.out.print("Veuillez saisir votre nom: ");
        String name = scanner.nextLine();

        // les notes:
        System.out.print("Veuillez saisir votre note en Mathématique: ");
          double mathNote = scanner.nextDouble();
        System.out.print("Veuillez saisir votre note en Physique-Chimie: ");
          double pc = scanner.nextDouble();
        System.out.print("Veuillez saisir votre note en Biologie: ");
          double biologie = scanner.nextDouble();
        System.out.print("Veuillez saisir votre note en Geologie: ");
          double geologie = scanner.nextDouble();
        
        
    // Calcule:
        double moyenne = (mathNote + pc + biologie + geologie)/ 4;

    
    // Affichage
        System.out.println("Bonjour "+name);
        if (moyenne >= 10 ){
          System.out.println("Félicitaion vous êtes admis avec une moyenne de:"+moyenne);
          if(moyenne >= 12 && moyenne <= 13.99){
          System.out.println("Avec mention Assez-bien:");
          }
          else if (moyenne >= 14 && moyenne <= 15.99){
          System.out.println("Avec mention Bien:");
          }
          else if (moyenne >=16 && moyenne <=17.99){
          System.out.println("Avec mention Très-Bien:");
          }
          else if (moyenne >= 18){
          System.out.println("Avec mention Honorable et Félicitation:");
          }
          
        }else{
          System.out.println("Vous redoublez la classe avec une moyenne de:"+moyenne);
        }
    









     scanner.close();

  }
}