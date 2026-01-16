# ceque ce mini projet m'a apprid de nouveau

J'ai appris à creer un tableau dynamiquement. De base les tableau en java sont static donc on peut pas modifier le tableaux une fois déclarer.

Mais avec cette methode ce serait possible:

```java
import java.util.Scanner;
public class DynamicArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau: ");
        int size = scanner.nextInt();

        // Création d'un tableau dynamique
        int[] dynamicArray = new int[size]; // ici je crée un nouvel objet tableau avec la taille donnée par l'utilisateur

        // Remplissage du tableau grace à une boucle
        for (int i = 0; i < size; i++) {
            System.out.print("Entrez la valeur pour l'index " + i + ": ");
            dynamicArray[i] = scanner.nextInt();
        }

        // Affichage des valeurs du tableau
        System.out.println("Les valeurs dans le tableau sont:");
        for (int value : dynamicArray) {
            System.out.println(value);
        }

        scanner.close();
    }
}
``` 