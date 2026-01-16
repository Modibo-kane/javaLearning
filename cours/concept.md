# Decouverte des Concepts

*JVM (Java Virtual Machine)*: C'est le moteur. Elle lit le Bytecode et l'exécute sur l'ordinateur. C'est elle qui gère la mémoire et s'assure que le programme ne plante pas tout le système.

*JRE (Java Runtime Environment)*: C'est le colis complet pour exécuter un programme. Il contient la JVM et les bibliothèques standards (des outils pré-construits, comme de quoi afficher du texte ou calculer une racine carrée).

*JDK (Java Development Kit)*: C'est la boîte à outils du développeur. Il contient le JRE + des outils de compilation (pour transformer ton texte en Bytecode).

## Voici comment cela se passe concrètement quand tu appuies sur "Exécuter"

**Code Source**: Tu écris un fichier qui se termine par .java (ex: MonProgramme.java). C'est du texte lisible par un humain.

**Compilation**: On utilise le compilateur (javac). Il vérifie tes fautes de syntaxe. S'il n'y a pas d'erreur, il génère un fichier .class. Ce fichier contient le Bytecode.

**Exécution**: La JVM prend ce fichier .class et le transforme instantanément en instructions que ton processeur comprend.

### Habitude Pro

*Dans le milieu bancaire, on utilise Java parce que la JVM est extrêmement robuste. Si un programme fait une erreur grave, la JVM peut l'isoler pour éviter que tout le serveur ne s'arrête. C'est ce qu'on appelle la "tolérance aux pannes" au niveau applicatif.*
