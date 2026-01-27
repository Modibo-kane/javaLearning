# 1. Qu'est-ce que JEE ?

`Java se divise en trois branches principales:`

- *Java ME (Micro Edition)* : Pour les systèmes embarqués comme les téléphones.
- *Java SE (Standard Edition)* : Le socle de base pour les applications classiques.
- *Java EE (Enterprise Edition)* : Une plateforme basée sur Java SE pour développer des applications réparties et critiques (commerce électronique, gestion, etc.) .

## 2. L'Architecture Multi-tiers

JEE repose sur une structure en couches pour séparer les responsabilités:

- *Client Tier* : Le navigateur web (client léger) ou une application Java (client lourd).
- *Middle Tier* (Serveur d'applications) : C'est le "cerveau". Il contient :
**Conteneur Web** : Gère les Servlets et les JSP (la présentation dynamique).
**Conteneur EJB** : Gère les EJB (Enterprise Java Beans), qui contiennent la logique métier complexe.
- *EIS Tier* (Data) : Les bases de données ou systèmes d'information existants.

## 3. Les Composants Web : Servlets et JSP

Le cours explique comment générer du contenu web dynamique:

*Servlet* : Un programme Java qui s'exécute sur le serveur. Il reçoit une requête HTTP, traite les données et renvoie une réponse.
*JSP (Java Server Pages)* : C'est l'inverse ; c'est une page HTML qui contient du code Java. À l'exécution, le serveur (comme Tomcat) transforme la JSP en Servlet.

## 4. Les Services et API de l'Infrastructure

Un serveur d'applications JEE fournit des outils prêts à l'emploi (API) pour simplifier le travail du développeur:

*JDBC* (Java DataBase Connexion) : Pour se connecter aux bases de données.
*JNDI* : Un annuaire pour retrouver des ressources par leur nom.
*JTA*: Pour gérer les transactions (s'assurer qu'une opération réussit partout ou échoue partout).
*JMS* (Java Message Service): Pour la communication asynchrone par messages entre applications.
*RMI* (Remote Method Invocation): Pour appeler des méthodes sur des objets situés sur un autre serveur.

## 5. Le Design Pattern MVC

`Le cours insiste sur le modèle Modèle-Vue-Contrôleur pour structurer l'application:`

*Modèle* : Les données et la logique.
*Vue* : L'interface utilisateur (JSP).
*Contrôleur* : Le lien entre les deux (souvent une Servlet).

**Différence clé**:
MVC 1 : Utilise plusieurs Servlets comme contrôleurs, ce qui peut devenir complexe à gérer.
MVC 2 : Utilise une seule Servlet centrale (Front Controller) qui distribue le travail, simplifiant ainsi la maintenance.

### Résumé : Serveur Web vs Serveur d'Applications

Un serveur web (comme Apache) gère le HTTP.
Le conteneur web (``Tomcat``) ajoute la capacité d'exécuter des Servlets/JSP.

*Le serveur d'applications (JBoss/WildFly, Glassfish) est complet* : il inclut le web + le conteneur EJB + tous les services d'infrastructure (JMS, JTA, etc.) .

<!-- -------------------------------------------------------------------------------------------------------------- -->

Guide d'Étude : Introduction à JEE

Sujet : Java Enterprise Edition (JEE) - Concepts fondamentaux et architecture
Sujets couverts :

Architecture Multi-tiers (Client, Web, Business, EIS)

Les Conteneurs JEE (Web vs EJB)

Les API de services (JDBC, JNDI, JTA, JMS, RMI)

Patterns de conception (MVC 1 vs MVC 2)

Résumé

JEE est une plateforme standardisée destinée au développement d'applications d'entreprise distribuées, sécurisées et robustes. Contrairement à Java SE, JEE fournit une infrastructure de services prête à l'emploi (gestion des transactions, sécurité, accès aux données) permettant aux développeurs de se concentrer sur la logique métier. L'architecture repose sur une séparation stricte des responsabilités via un modèle multi-tiers et l'utilisation de conteneurs spécialisés.

Concepts Clés

``1. L'Architecture Multi-tiers``
L'application est découpée en couches logiques s'exécutant sur différentes machines :

Client Tier : Généralement un navigateur (client léger) ou une application Java (client lourd).

Web Tier : Gère la présentation et l'interaction utilisateur (Servlets, JSP).

Business Tier : Gère la logique métier complexe et les règles de gestion (EJB).

EIS Tier : Systèmes d'information d'entreprise (Bases de données, ERP).

``2. Distinction des Conteneurs (Point d'amélioration)``
Il est crucial de bien différencier les deux environnements d'exécution du serveur d'applications :

Web Container : Héberge uniquement les composants Web (Servlets et JSP). Il transforme les requêtes HTTP en appels Java.

EJB Container : Héberge les Enterprise Java Beans (EJB). Il fournit des services avancés comme la gestion automatique des transactions et la sécurité déclarative.

``3. Le Pattern MVC (Modèle-Vue-Contrôleur)``
Modèle : Représente les données et la logique métier.

Vue : L'interface utilisateur (JSP).

Contrôleur : Reçoit les requêtes et orchestre la réponse (Servlet).

MVC 2 : Utilise un Front Controller unique (une seule servlet) pour centraliser la logique de navigation, contrairement au MVC 1 qui multiplie les servlets.

Liste de Vocabulaire

JNDI (Java Naming and Directory Interface) : Service d'annuaire permettant de localiser des ressources (bases de données, files de messages) par un nom logique.

JTA (Java Transaction API) : Garantit l'atomicité des opérations (tout réussit ou tout échoue).

JMS (Java Message Service) : API pour l'échange de messages asynchrones entre composants.

JDBC (Java Database Connectivity) : Standard pour l'accès aux bases de données relationnelles.

RMI (Remote Method Invocation) : Protocole permettant d'appeler des méthodes sur des objets distants.

Servlet : Classe Java s'exécutant sur le serveur pour traiter des requêtes (généralement HTTP).

JSP (Java Server Pages) : Document textuel (HTML) contenant des fragments de code Java, compilé en Servlet lors de l'exécution.

``Questions Clés pour l'Auto-Évaluation``

**Pourquoi dit-on que JEE est une architecture distribuée ?**

*Réponse attendue :* Parce que ses composants (Web, EJB, DB) peuvent s'exécuter sur des serveurs physiques différents pour assurer la montée en charge.

**Quelle est la différence fondamentale entre un serveur Web et un serveur d'applications ?**

*Réponse attendue :* Un serveur Web (ex: Apache) gère le HTTP ; un serveur d'applications (ex: WildFly) gère le HTTP + les conteneurs JEE (EJB, JMS, etc.).

**Pourquoi le MVC 2 est-il préféré au MVC 1 dans les grands projets ?**

*Réponse attendue :* À cause de la centralisation du contrôle via un Front Controller unique, ce qui facilite la maintenance et évite la prolifération des servlets.

**Si je veux stocker les règles de calcul d'un virement bancaire, dans quel conteneur dois-je placer ce code ?**

*Réponse attendue :* Dans l'EJB Container (Business Tier), car c'est une logique métier critique nécessitant des services de transaction (JTA).
