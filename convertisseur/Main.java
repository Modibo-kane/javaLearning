package convertisseur;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Veuillez saisir votre nom: ");
    String nom = scanner.nextLine();
      System.out.println("Bonjour " + nom);

    System.out.print("Veuillez saisir une distance en kilomètre: ");
    double distance = scanner.nextDouble();
      double distanceMiles = (distance * 0.621371);
        System.out.println(distance + "km = " + distanceMiles +"m");

    System.out.print("Veuillez saisir une température en dégré celsius: ");
    double temperature = scanner.nextDouble();
      double degre = temperature * (9.0/5.0) + 32;
        System.out.println(temperature + "°C = " + degre +"°F");

    System.out.print("Veuillez saisir une masse en Kilogrammes: ");
    double masse = scanner.nextDouble();
      double livres = masse * 2.20462;
        System.out.println(masse + "Kg = " + livres +"g");
    
    scanner.close();
  }
}
