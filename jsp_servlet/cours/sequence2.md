# 1. L'Environnement de Travail (L'IDE)
Le cours préconise l'utilisation d'Eclipse IDE for Java EE Developers. Contrairement à la version standard, celle-ci inclut par défaut :

- Des outils pour gérer les serveurs d'applications (comme JBoss).
- Des éditeurs pour les fichiers de configuration XML (web.xml).
- Le support natif pour les projets web (Dynamic Web Projects).

## 2. Le Serveur d'Applications : JBoss (WildFly)
Comme vu au chapitre 1, JBoss est le serveur d'applications Open Source le plus utilisé.

Il implémente toutes les spécifications JEE.

Il gère le cycle de vie de tes composants *(Servlets, JSP, EJB)*.

Le cours explique comment l'intégrer dans Eclipse pour pouvoir lancer et tester ton code en un clic.

## 3. Structure d'une Application Web (Point Crucial)
C'est la partie la plus importante pour tes futurs examens ou projets. Une application web JEE suit une hiérarchie de dossiers très stricte :

`Racine du projet` : Contient tes fichiers publics (HTML, images, CSS) et tes pages JSP.

`Dossier WEB-INF`/ *(Le "coffre-fort")* :

``Contenu privé`` : Tout ce qui est dedans n'est pas accessible directement par le client via une URL.

``web.xml`` : Le descripteur de déploiement *(le fichier de configuration)*.

``classes``/ : Contient tes fichiers .class *(tes Servlets compilées)*.

``lib/`` : Contient les bibliothèques externes *(.jar)*.

## 4. Le Cycle de Développement
Le cours détaille les étapes pour créer ton premier projet :

Créer un Dynamic Web Project.

Configurer le Runtime Target (pointer vers ton dossier JBoss).

Développer tes Servlets et JSP.

Déployer : Eclipse copie tes fichiers dans le dossier de déploiement de JBoss automatiquement.

### Ce qu'il faut retenir pour la pratique :
*Public vs Privé :* Si tu mets une JSP à la racine, tout le monde peut la voir. Si tu la mets dans WEB-INF, seule une Servlet peut y accéder.

*Le rôle du serveur :* Ce n'est pas Eclipse qui exécute ton code, c'est JBoss. Eclipse ne fait que lui envoyer les fichiers.

<!-- -------------------------------------------------------------------------------------------------------------- -->

**1. Le rôle du fichier web.xml**
Ce fichier se trouve obligatoirement dans WEB-INF/. Il sert à :

Déclarer les Servlets : Dire au serveur qu'une classe Java existe et doit agir comme une Servlet.

Définir le Mapping : Associer une URL (ex: /inscription) à une classe Java précise.

Configurer l'accueil : Définir quelle page s'affiche par défaut (souvent index.jsp).

**2. Exemple de déclaration (Le schéma classique)**
Dans ton cours, pour qu'un bouton ou un lien fonctionne, il faut ce pont entre le HTML et le Java :

XML
```xml
<servlet>
    <servlet-name>MaServlet</servlet-name>
    <servlet-class>com.monprojet.MaClasseServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>MaServlet</servlet-name>
    <url-pattern>/valider</url-pattern>
</servlet-mapping>
```
Si l'utilisateur va sur http://localhost:8080/MonProjet/valider, JBoss sait qu'il doit exécuter MaClasseServlet.

**3. Les bibliothèques (.jar)**
Le cours mentionne le dossier WEB-INF/lib.

C'est ici que tu mettras, par exemple, le driver pour te connecter à une base de données MySQL.

Règle d'or : Tout fichier .jar placé ici est automatiquement ajouté au "Classpath" de l'application par JBoss.

**4. Récapitulatif de la structure "Projet Web Dynamique"**
Sous Eclipse, voici ce que tu verras :
Structure d'un Projet Web JEE
27 janv., 15:17

Ce qui t'attend au Chapitre 3 :
Maintenant que tu as l'environnement (Eclipse + JBoss) et la structure (WEB-INF), le prochain chapitre va t'apprendre à écrire le code à l'intérieur des Servlets : comment récupérer ce qu'un utilisateur tape dans un formulaire et comment lui répondre.