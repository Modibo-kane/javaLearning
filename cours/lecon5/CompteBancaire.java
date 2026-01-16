package cours.lecon5;

public class CompteBancaire {
    // Attributs (Les données de l'objet)
    public String titulaire;
    public double solde;

    public CompteBancaire(String nom, double montantInitial) {
        this.titulaire = nom;
        this.solde = montantInitial;
    }

    // Méthode pour afficher l'état du compte
    public void afficherInfos() {
        System.out.println("Compte de " + titulaire + " | Solde : " + solde + "$");
    }

    // Méthode pour retirer (avec ta logique de l'Exo 3)
    public void tenterRetrait(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "$ : OK.");
        } else {
            System.out.println("Retrait de " + montant + "$ : REFUSÉ.");
        }
    }

    public void virementVers(CompteBancaire compte, double montant){
        
            String anotherCompteName = compte.titulaire;

        if ( solde>= montant){
           
            solde -= montant; // je retire le montant du compte de l'expéditeur

            compte.solde += montant; // j'ajoute sur le solde du compte du destinateur

            System.out.println("Transfer effectuer avec succès \n Vous avez envoyer: "+ montant +"$ à  "+anotherCompteName+ "\n Votre solde est de: "+ solde);

        } else {
            System.out.println("Transfer échouer:  Montant Insufisant");
        }

    }
}
