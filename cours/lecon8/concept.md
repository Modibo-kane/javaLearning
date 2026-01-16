# Les execptions

En programmation, les erreurs sont inévitables (mauvaise saisie utilisateur, perte de connexion, etc.). Au lieu de laisser le programme "planter" ou d'afficher de simples messages texte, Java utilise un système de signaux : les Exceptions.

## 1. Le principe : Lancer et Attraper

Imagine que le retrait est un colis. Si le solde est insuffisant, la méthode "lance" une alerte (le throw). Le programme principal doit être prêt à "attraper" cette alerte (le catch) pour éviter que tout ne s'arrête.

## 2. Comment lancer une exception ?

Pour lancer une exception, on utilise le mot-clé `throw` suivi d'une instance de la classe Exception. Par exemple :

```java
public void retirer(double montant) throws SoldeInsuffisantException {
    if (montant > solde) {
        throw new SoldeInsuffisantException("Solde insuffisant pour le retrait de " + montant);
    }
    solde -= montant;

    // "throws" indique que cette méthode peut lancer une exception
    // new SoldeInsuffisantException crée une nouvelle instance de l'exception
    // SoldeInsuffisantException est une classe personnalisée qui hérite de Exception on peut aussi utiliser des exceptions prédéfinies comme IllegalArgumentException 

    // En Java, tu ne peux pas utiliser n'importe quel mot comme exception car une Exception est aussi un objet. Pour qu'un mot soit reconnu comme une exception, il doit hériter de la classe parente Exception ou RuntimeException
    // Pour creer ta propre exception, tu dois définir une nouvelle classe qui étend Exception ou RuntimeException 
    // On crée un nouveau fichier SoldeInsuffisantException.java
    public class SoldeInsuffisantException extends RuntimeException {
        public SoldeInsuffisantException(String message) {
            super(message); // On envoie le message au parent (RuntimeException)
        }
    }
}
```

*1. Les Exceptions Standard*: Java fournit une bibliothèque d'exceptions déjà prêtes pour les cas courants :

**IllegalArgumentException** : On l'utilise quand un argument passé à une méthode est incorrect (ex: un montant négatif alors qu'on attend du positif).

**RuntimeException** : C'est une erreur qui survient durant l'exécution (ex: un calcul impossible ou un problème de logique comme le solde insuffisant).


## 3. Comment gérer l'erreur : Le bloc try-catch 

Dans ton main, si tu appelles une méthode qui peut lancer une exception, tu l'entoures d'un filet de sécurité avec `try` et `catch` :

```java
public static void main(String[] args) {
    CompteBancaire compte = new CompteBancaire(1000);

    try {
        compte.retirer(1500);
    } catch (SoldeInsuffisantException e) {
        System.out.println("Erreur : " + e.getMessage());
    }
}
```
