# 1. Pourquoi utiliser private ?

Lorsque tu déclares une variable comme `private`, tu empêches l'accès direct à cette variable depuis l'extérieur de la classe. Cela permet de protéger l'intégrité des données et d'assurer que les règles métier sont respectées.

`Exemple:`Si ton solde est public, un utilisateur malveillant peut écrire monCompte.solde = -5000; sans que ton programme ne puisse l'empêcher. En mettant le solde en private, tu forces tout le monde à passer par tes méthodes (tenterRetrait, etc.) qui contiennent tes règles de sécurité.

## 2. Les Accesseurs (Getters) et Mutateurs (Setters)

`Getter`: Une méthode pour lire la valeur (ex: getSolde).

`Setter`: Une méthode pour modifier la valeur sous condition (ex: setTitulaire).
