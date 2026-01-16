# Les tableaux en Java

Un tableau en Java est une structure de données qui permet de stocker plusieurs valeurs du même type dans une seule variable. Chaque valeur dans un tableau est accessible par son index, qui commence à zéro.

## 1. Déclarer un tableau

`----->  Voici comment on crée une liste de retraits en Java :`

```Java

double[] listeRetraits = {100.0, 50.0, 200.0, 500.0, 10.0};
    /*
      double[] : Les crochets indiquent que c'est un tableau de nombres décimaux.

      {...} : On met les valeurs à l'intérieur des accolades.
    */
```

## Parcourir le tableau avec une boucle

`----->  Voici comment on parcourt une liste de retraits en Java :`

```Java
for (int i = 0; i < listeRetraits.length; i++) {
    System.out.println("Retrait " + (i + 1) + " : " + listeRetraits[i]);
}
```
