# 1. Les Classes Abstraites (abstract)

Une classe abstraite est une classe qui ne peut pas être instanciée directement. Elle sert de modèle pour d'autres classes. Une classe abstraite peut contenir des méthodes abstraites (sans implémentation) que les sous-classes doivent implémenter.

Imagine que dans ta banque, tu ne puisses pas créer un "Compte" tout court. Un compte est forcément soit un "Compte Courant", soit un "Compte Épargne". Le mot-clé abstract permet de dire : "Cette classe est un modèle général, on n'a pas le droit de créer un objet directement avec (new CompteBancaire() devient interdit)".

```java
abstract class CompteBancaire {
    protected double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode abstraite
    public abstract void retirer(double montant);

    public void deposer(double montant) {
        solde += montant;
    }

    public double getSolde() {
        return solde;
    }
}

class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        super(soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé : découvert autorisé dépassé.");
        }
    }
}
```

Dans cet exemple, `CompteBancaire` est une classe abstraite avec une méthode abstraite `retirer()`. La classe `CompteCourant` hérite de `CompteBancaire` et fournit une implémentation concrète de la méthode `retirer()`. On ne peut pas créer une instance de `CompteBancaire` directement, mais on peut créer des instances de `CompteCourant`.

## 2. Les Interfaces

Une interface est un contrat qui définit un ensemble de méthodes que les classes doivent implémenter. Contrairement aux classes abstraites, une interface ne peut pas contenir d'état (variables d'instance) et toutes les méthodes sont implicitement abstraites (jusqu'à Java 8 où des méthodes par défaut peuvent être ajoutées).

```java
interface Payable {
    void payer(double montant);
}
class Facture implements Payable {
    private double montantTotal;

    public Facture(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    @Override
    // @Override indique que cette méthode implémente une méthode de l'interface
    public void payer(double montant) {
        if (montant >= montantTotal) {
            System.out.println("Facture payée en totalité.");
        } else {
            System.out.println("Paiement partiel de la facture.");
        }
    }
}
```

Dans cet exemple, `Payable` est une interface avec une méthode `payer()`. La classe `Facture` implémente cette interface et fournit une implémentation concrète de la méthode `payer()`. Toute classe qui implémente l'interface `Payable` doit fournir une implémentation pour la méthode `payer()`.