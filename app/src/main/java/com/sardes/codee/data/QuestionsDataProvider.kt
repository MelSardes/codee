package com.sardes.codee.data

object QuestionsDataProvider {
    val questions = listOf(
        Question(
            statement = "En quel année Google annonce-t-il Kotlin comme language n°1 pour le développement Android ?",
            response = "2019",
            propositions = listOf(
                "2011",
                "2019",
                "2023",
                "Jamais"
            )
        ),
        Question(
            statement = "Quel est le nom du compilateur Kotlin qui génère du bytecode pour la JVM ?",
            response = "Kotlin Compiler",
            propositions = listOf(
                "Java Compiler",
                "Kotlin Compiler",
                "JVM Compiler",
                "Bytecode Compiler"
            )
        ),
        Question(
            statement = "Quel est le mot-clé utilisé en Kotlin pour déclarer une variable qui ne peut être réassignée ?",
            response = "val",
            propositions = listOf(
                "var",
                "let",
                "const",
                "val"
            )
        ),
        Question(
            statement = "Quel est le nom du plugin Gradle qui permet de compiler du code Kotlin ?",
            response = "Kotlin Gradle Plugin",
            propositions = listOf(
                "Kotlin Compiler Plugin",
                "Gradle Kotlin Plugin",
                "Kotlin Gradle Plugin",
                "Kotlin Build Plugin"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction qui permet de créer une liste immuable en Kotlin ?",
            response = "listOf",
            propositions = listOf(
                "mutableListOf",
                "arrayListOf",
                "listOf",
                "setOf"
            )
        ),
        Question(
            statement = "Quel est le nom de la classe de base pour toutes les classes Kotlin ?",
            response = "Any",
            propositions = listOf(
                "Object",
                "Base",
                "Any",
                "All"
            )
        ),
        Question(
            statement = "Quel est le nom de l'opérateur Kotlin qui permet de vérifier si un objet est d'un certain type ?",
            response = "is",
            propositions = listOf(
                "as",
                "instanceof",
                "typeOf",
                "is"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction qui permet de convertir une chaîne de caractères en un entier en Kotlin ?",
            response = "toInt()",
            propositions = listOf(
                "toInteger()",
                "toInt()",
                "toInteger()",
                "parseToInt()"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction qui permet de concaténer deux chaînes de caractères en Kotlin ?",
            response = "plus()",
            propositions = listOf(
                "concat()",
                "merge()",
                "join()",
                "plus()"
            )
        ),
        Question(
            statement = "Quel est le nom de l'annotation Kotlin utilisée pour marquer une classe comme pouvant être héritée ?",
            response = "open",
            propositions = listOf(
                "final",
                "public",
                "abstract",
                "open"
            )
        ),
        Question(
            statement = "Quel est le nom de l'opérateur Kotlin qui permet de vérifier si une collection contient un certain élément ?",
            response = "in",
            propositions = listOf(
                "has",
                "contains",
                "in",
                "elementOf"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de vérifier si une chaîne de caractères commence par une autre chaîne ?",
            response = "startsWith()",
            propositions = listOf(
                "beginsWith()",
                "startsWith()",
                "startsWithWith()",
                "compareStart()"
            )
        ),
        Question(
            statement = "Quel est le nom de l'opérateur Kotlin qui permet de vérifier si deux objets ont la même référence ?",
            response = "===",
            propositions = listOf(
                "==",
                "===",
                "equals()",
                "referenceEquals()"
            )
        ),
        Question(
            statement = "Quel est le nom de la classe Kotlin qui représente une plage de nombres entiers ?",
            response = "IntRange",
            propositions = listOf(
                "Range",
                "NumberRange",
                "IntRange",
                "IntegerRange"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de trier une liste en ordre décroissant ?",
            response = "sortedDescending()",
            propositions = listOf(
                "reverseSorted()",
                "sortDescending()",
                "descending()",
                "sortedDescending()"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de filtrer les éléments d'une liste en fonction d'un prédicat ?",
            response = "filter()",
            propositions = listOf(
                "select()",
                "where()",
                "match()",
                "filter()"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de transformer une liste en une autre liste en appliquant une fonction à chaque élément ?",
            response = "map()",
            propositions = listOf(
                "transform()",
                "convert()",
                "apply()",
                "map()"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de plier (réduire) les éléments d'une liste en un résultat unique en appliquant une opération binaire ?",
            response = "fold()",
            propositions = listOf(
                "reduce()",
                "join()",
                "concat()",
                "fold()"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Kotlin qui permet de vérifier si tous les éléments d'une collection satisfont un prédicat ?",
            response = "all()",
            propositions = listOf(
                "every()",
                "each()",
                "all()",
                "forAll()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation les fonctions lambda ont-elles été introduites pour la première fois ?",
            response = "Lisp",
            propositions = listOf(
                "Lisp",
                "C++",
                "Java",
                "Python"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation qui a été créé spécialement pour l'écriture de scripts système ?",
            response = "Bash",
            propositions = listOf(
                "Perl",
                "Python",
                "Ruby",
                "Bash"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de jeux vidéo avec le moteur Unity ?",
            response = "C#",
            propositions = listOf(
                "Java",
                "C++",
                "C#",
                "Python"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour la création de macros dans Microsoft Excel ?",
            response = "Visual Basic for Applications (VBA)",
            propositions = listOf(
                "C#",
                "Java",
                "Visual Basic",
                "Visual Basic for Applications (VBA)"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation a été écrit le système d'exploitation macOS d'Apple ?",
            response = "Objective-C",
            propositions = listOf(
                "C++",
                "Swift",
                "Java",
                "Objective-C"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation principalement utilisé pour le développement de logiciels pour les systèmes embarqués ?",
            response = "C",
            propositions = listOf(
                "Java",
                "Python",
                "C#",
                "C"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation a été écrit le navigateur web Google Chrome ?",
            response = "C++",
            propositions = listOf(
                "Java",
                "Python",
                "C#",
                "C++"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour la plateforme Salesforce ?",
            response = "Apex",
            propositions = listOf(
                "Ruby",
                "Java",
                "C#",
                "Apex"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour l'écriture de scripts sur le système d'exploitation Linux ?",
            response = "Bash",
            propositions = listOf(
                "Python",
                "Ruby",
                "Perl",
                "Bash"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de jeux vidéo avec le moteur Unreal Engine ?",
            response = "C++",
            propositions = listOf(
                "Java",
                "C#",
                "Python",
                "C++"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation principalement utilisé pour le développement de logiciels pour les systèmes d'exploitation Windows ?",
            response = "C#",
            propositions = listOf(
                "Java",
                "Python",
                "C",
                "C#"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation principalement utilisé pour le développement de jeux vidéo sur la console PlayStation de Sony ?",
            response = "C++",
            propositions = listOf(
                "Java",
                "C#",
                "Python",
                "C++"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour la plateforme SAP ?",
            response = "ABAP",
            propositions = listOf(
                "Java",
                "C#",
                "ABAP",
                "Python"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour la plateforme Oracle ?",
            response = "Java",
            propositions = listOf(
                "C++",
                "Python",
                "C#",
                "Java"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation a été écrit le framework web Ruby on Rails ?",
            response = "Ruby",
            propositions = listOf(
                "Java",
                "C++",
                "Python",
                "Ruby"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de jeux vidéo avec le moteur CryEngine ?",
            response = "C++",
            propositions = listOf(
                "Java",
                "C#",
                "Python",
                "C++"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour les robots de la marque LEGO ?",
            response = "Java",
            propositions = listOf(
                "C++",
                "Python",
                "Java",
                "C#"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour les robots de la marque VEX Robotics ?",
            response = "RobotC",
            propositions = listOf(
                "Java",
                "Python",
                "C++",
                "RobotC"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation a été écrit le système d'exploitation Android de Google ?",
            response = "Java",
            propositions = listOf(
                "C++",
                "Python",
                "Java",
                "C#"
            )
        ),
        Question(
            statement = "Quel est le langage de programmation utilisé pour le développement de logiciels pour la plateforme Magento ?",
            response = "PHP",
            propositions = listOf(
                "Ruby",
                "Java",
                "C#",
                "PHP"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation a été écrit le célèbre jeu vidéo Minecraft ?",
            response = "Java",
            propositions = listOf(
                "C++",
                "Python",
                "Java",
                "C#"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'une fonction récursive en programmation ?",
            response = "Une fonction qui s'appelle elle-même",
            propositions = listOf(
                "Une fonction qui prend en entrée un tableau",
                "Une fonction qui trie un tableau",
                "Une fonction qui calcule la factorielle d'un nombre",
                "Une fonction qui s'appelle elle-même"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'un pointeur en langage C ?",
            response = "Une variable qui contient l'adresse mémoire d'une autre variable",
            propositions = listOf(
                "Un type de donnée qui permet de stocker des nombres décimaux",
                "Une structure de données pour stocker des données de manière hiérarchique",
                "Une variable qui contient l'adresse mémoire d'une autre variable",
                "Un mot-clé réservé pour définir une variable constante"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'un algorithme de tri en informatique ?",
            response = "Un algorithme qui permet de trier un ensemble de données selon un ordre donné",
            propositions = listOf(
                "Un algorithme qui permet de trouver la racine carrée d'un nombre",
                "Un algorithme qui permet de résoudre une équation polynomiale",
                "Un algorithme qui permet de trier un ensemble de données selon un ordre donné",
                "Un algorithme qui permet de détecter la présence d'un virus sur un ordinateur"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'un deadlock en programmation ?",
            response = "Une situation où deux ou plusieurs processus sont bloqués en attendant des ressources qui sont détenues par d'autres processus",
            propositions = listOf(
                "Une boucle infinie dans un programme",
                "Une erreur de syntaxe dans un programme",
                "Une situation où un programme plante",
                "Une situation où deux ou plusieurs processus sont bloqués en attendant des ressources qui sont détenues par d'autres processus"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'une injection SQL ?",
            response = "Une attaque informatique visant à exploiter les vulnérabilités d'un site web pour accéder à des informations confidentielles",
            propositions = listOf(
                "Un type de requête SQL permettant de récupérer des données dans une base de données",
                "Une méthode de cryptage de données sensibles",
                "Un outil pour générer du code SQL à partir d'un diagramme de classes",
                "Une attaque informatique visant à exploiter les vulnérabilités d'un site web pour accéder à des informations confidentielles"
            )
        ),
        Question(
            statement = "Qu'est-ce qu'un thread en programmation ?",
            response = "Un flux d'exécution indépendant dans un programme",
            propositions = listOf(
                "Un type de variable pour stocker des données textuelles",
                "Un ensemble de fonctions pour manipuler des images",
                "Un flux d'exécution indépendant dans un programme",
                "Un format de fichier pour stocker des données structurées"
            )
        ),
    )
}