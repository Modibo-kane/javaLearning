# Ce que j'ai appris en faisant ce projet

**Scanner**: Permet de lire les entrées utilisateur depuis la console.
pour l'utiliser on doit d'abord importer la classe Scanner:

```java
import java.util.Scanner;
```

puis on crée une instance de Scanner:

```java
Scanner scanner = new Scanner(System.in);
```

Ex: Pour recuperer un nom, age, temprature

```java
String nom = scanner.nextLine();
double celsius = scanner.nextDouble();
int age = scanner.nextInt();
```

*Et la fin:* Quand on fini avec le scaneur on fait: 

```java
scaner.close();
// ou si on veut pas faire ça on fait :

try (Scanner scanner = new Scanner(System.in)){
  // ici  on fait éxécude le code 
}
```
