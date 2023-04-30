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
        Question(
            statement = "Quelle est la méthode en Java pour arrondir un nombre décimal à l'entier le plus proche ?",
            response = "Math.round()",
            propositions = listOf(
                "Math.floor()",
                "Math.ceil()",
                "Math.round()",
                "Math.trunc()"
            )
        ),

        Question(
            statement = "Quelle est la méthode en Python pour obtenir la taille d'une liste ?",
            response = "len()",
            propositions = listOf(
                "count()",
                "size()",
                "length()",
                "len()"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation est utilisé le framework Ruby on Rails ?",
            response = "Ruby",
            propositions = listOf(
                "Python",
                "Java",
                "C#",
                "Ruby"
            )
        ),

        Question(
            statement = "Quelle est la méthode en JavaScript pour convertir une chaîne de caractères en nombre décimal ?",
            response = "parseFloat()",
            propositions = listOf(
                "parseInt()",
                "toFixed()",
                "parseFloat()",
                "toPrecision()"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation est utilisé le framework React pour le développement web ?",
            response = "JavaScript",
            propositions = listOf(
                "Java",
                "C#",
                "Ruby",
                "JavaScript"
            )
        ),

        Question(
            statement = "Quelle est la méthode en Kotlin pour supprimer le premier élément d'une liste mutable ?",
            response = "removeAt(0)",
            propositions = listOf(
                "removeFirst()",
                "removeAt(0)",
                "removeLast()",
                "remove()"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation est utilisé le framework Angular pour le développement web ?",
            response = "TypeScript",
            propositions = listOf(
                "JavaScript",
                "Python",
                "TypeScript",
                "Ruby"
            )
        ),

        Question(
            statement = "Quelle est la méthode en Python pour ajouter un élément à la fin d'une liste ?",
            response = "append()",
            propositions = listOf(
                "insert()",
                "extend()",
                "add()",
                "append()"
            )
        ),

        Question(
            statement = "Quelle est la méthode en Java pour convertir une chaîne de caractères en nombre entier ?",
            response = "Integer.parseInt()",
            propositions = listOf(
                "int.parse()",
                "parseInteger()",
                "Integer.parseInt()",
                "toInteger()"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation est utilisé le framework Laravel pour le développement web ?",
            response = "PHP",
            propositions = listOf(
                "Java",
                "Python",
                "C#",
                "PHP"
            )
        ),

        Question(
            statement = "Quelle est la méthode en Kotlin pour concaténer deux chaînes de caractères ?",
            response = "plus()",
            propositions = listOf(
                "concat()",
                "append()",
                "plus()",
                "join()"
            )
        ),
        Question(
            statement = "Quelle est la méthode en Python pour supprimer un élément spécifique d'une liste ?",
            response = "remove()",
            propositions = listOf(
                "delete()",
                "erase()",
                "remove()",
                "discard()"
            )
        ),

        Question(
            statement = "En Java, quelle est la différence entre les opérateurs == et equals() ?",
            response = "L'opérateur == compare les références des objets, tandis que equals() compare le contenu des objets.",
            propositions = listOf(
                "L'opérateur == compare le contenu des objets, tandis que equals() compare les références des objets.",
                "Les deux opérateurs comparent les références des objets.",
                "Les deux opérateurs comparent le contenu des objets.",
                "Aucune différence, les deux opérateurs fonctionnent de la même manière."
            )
        ),

        Question(
            statement = "En CSS, quelle est la propriété utilisée pour définir la couleur de fond d'un élément ?",
            response = "background-color",
            propositions = listOf(
                "color",
                "background-color",
                "text-color",
                "fill-color"
            )
        ),

        Question(
            statement = "En JavaScript, quelle est la méthode pour ajouter un élément à la fin d'un tableau ?",
            response = "push()",
            propositions = listOf(
                "add()",
                "append()",
                "push()",
                "insert()"
            )
        ),

        Question(
            statement = "Quelle est la méthode en PHP pour ouvrir un fichier en mode écriture ?",
            response = "fopen()",
            propositions = listOf(
                "open()",
                "write()",
                "create()",
                "fopen()"
            )
        ),

        Question(
            statement = "En C++, quelle est la fonction utilisée pour lire une chaîne de caractères depuis l'entrée standard ?",
            response = "getline()",
            propositions = listOf(
                "readline()",
                "scanf()",
                "gets()",
                "getline()"
            )
        ),

        Question(
            statement = "En Ruby, quelle est la méthode utilisée pour ajouter un élément à la fin d'un tableau ?",
            response = "push()",
            propositions = listOf(
                "add()",
                "append()",
                "push()",
                "insert()"
            )
        ),

        Question(
            statement = "En CSS, quelle est la propriété utilisée pour définir la couleur du texte d'un élément ?",
            response = "color",
            propositions = listOf(
                "color",
                "text-color",
                "background-color",
                "fill-color"
            )
        ),

        Question(
            statement = "En Python, quelle est la méthode utilisée pour ouvrir un fichier en mode écriture ?",
            response = "open()",
            propositions = listOf(
                "fopen()",
                "write()",
                "create()",
                "open()"
            )
        ),

        Question(
            statement = "En Java, quelle est la méthode pour obtenir la taille d'un tableau ?",
            response = "length",
            propositions = listOf(
                "size()",
                "count()",
                "length()",
                "getLength()"
            )
        ),
        Question(
            statement = "Dans quelle année a été publiée la première version du langage de programmation Python ?",
            response = "1991",
            propositions = listOf(
                "1989",
                "1991",
                "1993",
                "1995"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction en Python qui permet de supprimer un élément d'une liste ?",
            response = "remove()",
            propositions = listOf(
                "pop()",
                "delete()",
                "remove()",
                "discard()"
            )
        ),
        Question(
            statement = "Quel est le nom du créateur de Git, le système de contrôle de version distribué ?",
            response = "Linus Torvalds",
            propositions = listOf(
                "Bill Gates",
                "Steve Jobs",
                "Mark Zuckerberg",
                "Linus Torvalds"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation les fonctions sont-elles des objets de première classe ?",
            response = "JavaScript",
            propositions = listOf(
                "Java",
                "Python",
                "C++",
                "JavaScript"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction en Ruby qui permet de concaténer deux chaînes de caractères ?",
            response = "concat()",
            propositions = listOf(
                "add()",
                "concat()",
                "merge()",
                "combine()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation est utilisée la syntaxe ++i pour incrémenter une variable ?",
            response = "C++",
            propositions = listOf(
                "C",
                "Java",
                "C#",
                "C++"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction en PHP qui permet de trier un tableau dans l'ordre croissant ?",
            response = "sort()",
            propositions = listOf(
                "order()",
                "sort()",
                "arrange()",
                "group()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation est utilisée la notation '=>' pour définir une fonction anonyme ?",
            response = "PHP",
            propositions = listOf(
                "Ruby",
                "Python",
                "JavaScript",
                "PHP"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction en Java qui permet de convertir une chaîne de caractères en un entier ?",
            response = "parseInt()",
            propositions = listOf(
                "toInt()",
                "convertToInt()",
                "parseInteger()",
                "parseInt()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation est utilisée la notation '!' pour nier une condition ?",
            response = "Kotlin",
            propositions = listOf(
                "Swift",
                "Kotlin",
                "Ruby",
                "Go"
            )
        ),
        Question(
            statement = "Quel est le principal avantage de l'utilisation de Git pour la gestion de versions de code source?",
            response = "Collaboration facilitée",
            propositions = listOf(
                "Meilleure performance",
                "Gestion de projets plus facile",
                "Collaboration facilitée",
                "Meilleure sécurité"
            )
        ),

        Question(
            statement = "Quel est le type de donnée en Python qui peut contenir des valeurs de différents types ?",
            response = "Liste",
            propositions = listOf(
                "Liste",
                "Tuple",
                "Ensemble",
                "Dictionnaire"
            )
        ),

        Question(
            statement = "Quel est le nom de la méthode en JavaScript utilisée pour ajouter un nouvel élément à la fin d'un tableau ?",
            response = "push()",
            propositions = listOf(
                "push()",
                "add()",
                "append()",
                "insert()"
            )
        ),

        Question(
            statement = "Quel est le nom de la bibliothèque Python utilisée pour la manipulation de données tabulaires ?",
            response = "Pandas",
            propositions = listOf(
                "NumPy",
                "Matplotlib",
                "Pandas",
                "SciPy"
            )
        ),

        Question(
            statement = "Quelle est la syntaxe utilisée en CSS pour sélectionner tous les éléments d'une certaine classe ?",
            response = ".nom-de-classe",
            propositions = listOf(
                "#nom-de-classe",
                ".nom-de-classe",
                ":nom-de-classe",
                "nom-de-classe"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation peut-on utiliser le mot-clé 'self' pour faire référence à l'objet courant ?",
            response = "Python",
            propositions = listOf(
                "Java",
                "Python",
                "C++",
                "Ruby"
            )
        ),

        Question(
            statement = "Quel est le nom de la méthode en Python utilisée pour renverser l'ordre des éléments d'une liste ?",
            response = "reverse()",
            propositions = listOf(
                "invert()",
                "reverse()",
                "flip()",
                "backwards()"
            )
        ),

        Question(
            statement = "Quel est le nom de la méthode en JavaScript utilisée pour convertir une chaîne de caractères en nombre entier ?",
            response = "parseInt()",
            propositions = listOf(
                "parseInt()",
                "toFloat()",
                "toInteger()",
                "convertToInt()"
            )
        ),

        Question(
            statement = "Dans quelle section d'un document HTML doit-on placer le code CSS ?",
            response = "<head>",
            propositions = listOf(
                "<body>",
                "<head>",
                "<title>",
                "<footer>"
            )
        ),

        Question(
            statement = "Dans quelle section d'un fichier Python doit-on définir une fonction ?",
            response = "Partie principale",
            propositions = listOf(
                "Partie principale",
                "En-tête",
                "Partie de définition",
                "Partie d'initialisation"
            )
        ),
        Question(
            statement = "Quelle est la méthode JavaScript utilisée pour ajouter un nouvel élément à un tableau existant ?",
            response = "push()",
            propositions = listOf(
                "add()",
                "insert()",
                "push()",
                "append()"
            )
        ),
        Question(
            statement = "Quelle est la méthode Java qui permet de convertir une chaîne de caractères en un entier ?",
            response = "parseInt()",
            propositions = listOf(
                "parseString()",
                "parseInt()",
                "toInteger()",
                "toInt()"
            )
        ),
        Question(
            statement = "Quelle est la méthode Python utilisée pour supprimer un élément d'une liste ?",
            response = "remove()",
            propositions = listOf(
                "delete()",
                "remove()",
                "erase()",
                "pop()"
            )
        ),
        Question(
            statement = "Quelle est la fonction PHP utilisée pour envoyer des informations à l'utilisateur ?",
            response = "echo",
            propositions = listOf(
                "print",
                "output",
                "send",
                "echo"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la méthode splice() est-elle utilisée pour supprimer des éléments d'un tableau ?",
            response = "JavaScript",
            propositions = listOf(
                "JavaScript",
                "Java",
                "Python",
                "PHP"
            )
        ),
        Question(
            statement = "Quel est le nom de la fonction Ruby utilisée pour trier une liste d'éléments ?",
            response = "sort",
            propositions = listOf(
                "sort",
                "order",
                "arrange",
                "group"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la méthode append() est-elle utilisée pour ajouter un élément à une liste ?",
            response = "Python",
            propositions = listOf(
                "JavaScript",
                "Java",
                "Python",
                "Ruby"
            )
        ),
        Question(
            statement = "Quelle est la fonction C++ utilisée pour afficher des informations sur la console ?",
            response = "cout",
            propositions = listOf(
                "log",
                "print",
                "display",
                "cout"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la méthode concat() est-elle utilisée pour fusionner deux chaînes de caractères ?",
            response = "JavaScript",
            propositions = listOf(
                "JavaScript",
                "Java",
                "Python",
                "PHP"
            )
        ),
        Question(
            statement = "Quelle est la méthode Java utilisée pour obtenir la longueur d'une chaîne de caractères ?",
            response = "length()",
            propositions = listOf(
                "size()",
                "length()",
                "count()",
                "getLength()"
            )
        ),
        Question(
            statement = "Quel est le nom de la méthode Java permettant de copier un tableau dans un autre tableau ?",
            response = "arraycopy()",
            propositions = listOf(
                "copyArray()",
                "clone()",
                "arraycopy()",
                "duplicate()"
            )
        ),

        Question(
            statement = "Quelle est la différence entre une interface et une classe abstraite en Java ?",
            response = "Une classe abstraite peut contenir des implémentations de méthodes, mais une interface ne le peut pas.",
            propositions = listOf(
                "Une interface ne peut contenir que des déclarations de méthodes, mais une classe abstraite peut contenir des implémentations de méthodes.",
                "Une classe abstraite et une interface sont identiques en termes de fonctionnalités et de structure.",
                "Une interface peut être instanciée, mais une classe abstraite ne le peut pas.",
                "Une classe abstraite peut contenir des implémentations de méthodes, mais une interface ne le peut pas."
            )
        ),

        Question(
            statement = "Qu'est-ce que le modèle MVC en développement web ?",
            response = "Le modèle MVC est un motif de conception utilisé pour séparer la logique métier, l'interface utilisateur et les données dans une application web.",
            propositions = listOf(
                "Le modèle MVC est un langage de programmation utilisé pour créer des sites web.",
                "Le modèle MVC est une méthode de développement de site web qui ne nécessite pas de compétences en programmation.",
                "Le modèle MVC est un cadre de développement web utilisé pour créer des applications en ligne.",
                "Le modèle MVC est un motif de conception utilisé pour séparer la logique métier, l'interface utilisateur et les données dans une application web."
            )
        ),

        Question(
            statement = "Qu'est-ce qu'un thread en programmation ?",
            response = "Un thread est un flux d'exécution léger qui peut être exécuté en parallèle avec d'autres threads.",
            propositions = listOf(
                "Un thread est une unité de code qui ne peut être exécutée qu'une fois.",
                "Un thread est un type de variable utilisé pour stocker des données dans un programme.",
                "Un thread est une fonction qui doit être exécutée en premier dans un programme.",
                "Un thread est un flux d'exécution léger qui peut être exécuté en parallèle avec d'autres threads."
            )
        ),

        Question(
            statement = "Quel est l'objectif du modèle CRUD dans la programmation ?",
            response = "Le modèle CRUD est un ensemble d'opérations de base qui peuvent être effectuées sur une base de données ou un autre système de stockage de données.",
            propositions = listOf(
                "Le modèle CRUD est une méthode de développement de logiciels qui ne nécessite pas de compétences en programmation.",
                "Le modèle CRUD est un langage de programmation utilisé pour créer des applications de base de données.",
                "Le modèle CRUD est un ensemble de tests utilisés pour valider le fonctionnement d'un système.",
                "Le modèle CRUD est un ensemble d'opérations de base qui peuvent être effectuées sur une base de données ou un autre système de stockage de données."
            )
        ),
        Question(
            statement = "Dans quel langage de programmation utilise-t-on l'instruction 'print' pour afficher du texte à l'écran ?",
            response = "Python",
            propositions = listOf(
                "Java",
                "C++",
                "Python",
                "Ruby"
            )
        ),

        Question(
            statement = "Quelle est la méthode en JavaScript pour ajouter un élément à la fin d'un tableau ?",
            response = "push()",
            propositions = listOf(
                "add()",
                "append()",
                "push()",
                "concat()"
            )
        ),

        Question(
            statement =
            "En C#, quelle est la méthode pour vérifier si une chaîne de caractères contient une autre chaîne de caractères ?",
            response = "Contains()",
            propositions = listOf(
                "Exists()",
                "Contains()",
                "Includes()",
                "In()",
            )
        ),

        Question(
            statement = "En Python, comment convertit-on une chaîne de caractères en entier ?",
            response = "int()",
            propositions = listOf(
                "to_int()",
                "parse_int()",
                "as_int()",
                "int()",
            )
        ),

        Question(
            statement = "En Java, comment déclarer une variable entière qui ne peut pas être modifiée une fois initialisée ?",
            response = "final int",
            propositions = listOf(
                "immutable int",
                "constant int",
                "readonly int",
                "final int",
            )
        ),

        Question(
            statement = "Dans quel langage de programmation utilise-t-on l'opérateur '==' pour comparer deux valeurs ?",
            response = "Java",
            propositions = listOf(
                "C++",
                "Python",
                "Java",
                "JavaScript",
            )
        ),

        Question(
            statement = "En Ruby, comment déclarer une méthode ?",
            response = "def",
            propositions = listOf(
                "function",
                "method",
                "def",
                "define",
            )
        ),

        Question(
            statement = "Dans quel langage de programmation utilise-t-on le symbole '$' pour déclarer une variable ?",
            response = "PHP",
            propositions = listOf(
                "JavaScript",
                "Python",
                "PHP",
                "Ruby",
            )
        ),

        Question(
            statement = "En C++, quelle est la méthode pour supprimer le dernier élément d'un tableau ?",
            response = "pop_back()",
            propositions = listOf(
                "delete()",
                "remove()",
                "pop_back()",
                "erase()",
            )
        ),

        Question(
            statement = "En JavaScript, quelle est la méthode pour transformer une chaîne de caractères en tableau ?",
            response = "split()",
            propositions = listOf(
                "join()",
                "concat()",
                "split()",
                "array()",
            )
        ),
        Question(
            statement = "Quelle est la méthode Java pour convertir une chaîne en un tableau de caractères ?",
            response = "toCharArray()",
            propositions = listOf(
                "toCharArray()",
                "charArray()",
                "convertToArray()",
                "stringToArray()"
            )
        ),

        Question(
            statement = "Quelle est la différence entre une classe abstraite et une interface en Java ?",
            response = "Une classe abstraite peut avoir des implémentations de méthode, une interface ne peut pas.",
            propositions = listOf(
                "Une classe abstraite peut être instanciée, une interface ne peut pas.",
                "Une interface peut avoir des variables, une classe abstraite ne peut pas.",
                "Une classe abstraite peut avoir des implémentations de méthode, une interface ne peut pas.",
                "Une interface peut être étendue, une classe abstraite ne peut pas."
            )
        ),

        Question(
            statement = "Quelle est la fonction Python pour trier une liste en ordre décroissant ?",
            response = "sort(reverse=True)",
            propositions = listOf(
                "sort(reverse=False)",
                "sort(reverse=True)",
                "sort()",
                "order(reverse=True)"
            )
        ),

        Question(
            statement = "Quelle est la syntaxe CSS pour sélectionner tous les éléments d'une classe spécifique ?",
            response = ".nom-de-classe",
            propositions = listOf(
                "#nom-de-classe",
                "nom-de-classe",
                ".nom-de-classe",
                "@nom-de-classe"
            )
        ),

        Question(
            statement = "Dans quel langage de programmation la boucle 'for each' a-t-elle été introduite pour la première fois ?",
            response = "Smalltalk",
            propositions = listOf(
                "Java",
                "C++",
                "Python",
                "Smalltalk"
            )
        ),

        Question(
            statement = "Quelle est la méthode Java utilisée pour arrondir un nombre décimal à l'entier le plus proche ?",
            response = "Math.round()",
            propositions = listOf(
                "Math.floor()",
                "Math.ceil()",
                "Math.trunc()",
                "Math.round()"
            )
        ),
        Question(
            statement = "Quelle est la méthode Python utilisée pour trier une liste par ordre croissant ?",
            response = "sort()",
            propositions = listOf(
                "order()",
                "sort()",
                "ascending()",
                "arrange()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la fonction main() est-elle utilisée pour démarrer le programme ?",
            response = "Java",
            propositions = listOf(
                "Java",
                "C++",
                "Python",
                "JavaScript"
            )
        ),
        Question(
            statement = "Quelle est la méthode PHP utilisée pour ajouter un élément à la fin d'un tableau ?",
            response = "array_push()",
            propositions = listOf(
                "array_push()",
                "array_add()",
                "array_append()",
                "array_insert()"
            )
        ),
        Question(
            statement = "Quelle est la méthode JavaScript utilisée pour renvoyer la longueur d'une chaîne de caractères ?",
            response = "length",
            propositions = listOf(
                "len()",
                "size()",
                "length()",
                "count()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la méthode printf() est-elle utilisée pour afficher du texte formaté ?",
            response = "C",
            propositions = listOf(
                "Java",
                "Python",
                "C++",
                "C"
            )
        ),
        Question(
            statement = "Quelle est la méthode Python utilisée pour renvoyer le plus grand élément d'une liste ?",
            response = "max()",
            propositions = listOf(
                "maximum()",
                "max()",
                "greatest()",
                "biggest()"
            )
        ),
        Question(
            statement = "Quelle est la méthode Java utilisée pour obtenir la longueur d'une chaîne de caractères ?",
            response = "length()",
            propositions = listOf(
                "len()",
                "size()",
                "length()",
                "count()"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation la méthode slice() est-elle utilisée pour extraire une partie d'une chaîne de caractères ?",
            response = "JavaScript",
            propositions = listOf(
                "Python",
                "Java",
                "PHP",
                "JavaScript"
            )
        ),
        Question(
            statement = "Quelle est la méthode PHP utilisée pour trier un tableau par ordre croissant ?",
            response = "sort()",
            propositions = listOf(
                "order()",
                "sort()",
                "ascending()",
                "arrange()"
            )
        ),
        Question(
            statement = "Quelle est la différence entre un langage de programmation interprété et un langage de programmation compilé ?",
            response = "Un langage de programmation interprété est exécuté ligne par ligne tandis qu'un langage de programmation compilé est converti en langage machine avant l'exécution.",
            propositions = listOf(
                "Un langage de programmation interprété est plus rapide qu'un langage de programmation compilé.",
                "Un langage de programmation interprété est converti en langage machine avant l'exécution tandis qu'un langage de programmation compilé est exécuté ligne par ligne.",
                "Un langage de programmation interprété est exécuté ligne par ligne tandis qu'un langage de programmation compilé est converti en langage machine avant l'exécution.",
                "Un langage de programmation interprété et un langage de programmation compilé sont deux termes synonymes qui désignent le même type de langage de programmation."
            )
        ),
        Question(
            statement = "Qu'est-ce qu'une clé étrangère dans une base de données ?",
            response = "Une clé étrangère est une référence à une clé primaire d'une autre table dans une base de données.",
            propositions = listOf(
                "Une clé étrangère est une clé qui n'a pas de relation avec d'autres tables dans une base de données.",
                "Une clé étrangère est une clé qui peut être utilisée comme identifiant unique pour chaque ligne d'une table dans une base de données.",
                "Une clé étrangère est une référence à une clé primaire d'une autre table dans une base de données.",
                "Une clé étrangère est une clé qui peut être utilisée pour regrouper des données similaires dans une table dans une base de données."
            )
        ),
        Question(
            statement = "Qu'est-ce qu'une classe dans la programmation orientée objet ?",
            response = "Une classe est un modèle pour la création d'objets qui regroupe des données et des méthodes qui agissent sur ces données.",
            propositions = listOf(
                "Une classe est une fonction qui peut être appelée à partir d'un autre programme dans la programmation orientée objet.",
                "Une classe est un type de données qui peut stocker plusieurs valeurs dans la programmation orientée objet.",
                "Une classe est un modèle pour la création d'objets qui regroupe des données et des méthodes qui agissent sur ces données.",
                "Une classe est un ensemble de règles qui régissent l'interaction entre les objets dans la programmation orientée objet."
            )
        ),
        Question(
            statement = "Qu'est-ce qu'une boucle for dans la programmation ?",
            response = "Une boucle for est une structure de contrôle qui permet de répéter un bloc de code un nombre défini de fois.",
            propositions = listOf(
                "Une boucle for est une fonction qui prend en entrée un tableau et retourne un élément spécifique de ce tableau.",
                "Une boucle for est une fonction qui permet d'effectuer une opération arithmétique sur un ou plusieurs nombres.",
                "Une boucle for est une structure de contrôle qui permet de répéter un bloc de code un nombre défini de fois.",
                "Une boucle for est une instruction conditionnelle qui permet de vérifier si une condition est vraie ou fausse dans un programme."
            )
        ),
        Question(
            statement = "Quelle est la différence entre les méthodes HTTP GET et POST ?",
            response = "GET est utilisé pour récupérer des données, tandis que POST est utilisé pour envoyer des données",
            propositions = listOf(
                "GET est utilisé pour envoyer des données, tandis que POST est utilisé pour récupérer des données",
                "GET est utilisé pour mettre à jour des données, tandis que POST est utilisé pour créer de nouvelles données",
                "GET est utilisé pour supprimer des données, tandis que POST est utilisé pour modifier des données existantes",
                "GET est utilisé pour récupérer des données, tandis que POST est utilisé pour envoyer des données"
            )
        ),
        Question(
            statement = "Dans quelle balise HTML se trouve le code JavaScript ?",
            response = "<script>",
            propositions = listOf(
                "<head>",
                "<body>",
                "<script>",
                "<html>"
            )
        ),
        Question(
            statement = "Quelle est la syntaxe pour créer une fonction en Python ?",
            response = "def nom_de_la_fonction():",
            propositions = listOf(
                "function nom_de_la_fonction():",
                "def nom_de_la_fonction():",
                "create function nom_de_la_fonction():",
                "new function nom_de_la_fonction():"
            )
        ),
        Question(
            statement = "Dans quelle langue de programmation utilise-t-on la boucle for each ?",
            response = "JavaScript",
            propositions = listOf(
                "Java",
                "Python",
                "PHP",
                "JavaScript"
            )
        ),
        Question(
            statement = "Quelle est la fonction en CSS qui permet de créer une ombre portée sur un élément ?",
            response = "box-shadow",
            propositions = listOf(
                "shadow-box",
                "element-shadow",
                "box-shadow",
                "element-box-shadow"
            )
        ),
        Question(
            statement = "Quelle est la balise HTML utilisée pour insérer une image ?",
            response = "<img>",
            propositions = listOf(
                "<img>",
                "<image>",
                "<picture>",
                "<photo>"
            )
        ),
        Question(
            statement = "Quelle est la méthode CSS utilisée pour centrer un élément horizontalement ?",
            response = "margin: 0 auto;",
            propositions = listOf(
                "center: 0 auto;",
                "margin: auto 0;",
                "margin: 0 auto;",
                "center: auto 0;"
            )
        ),
        Question(
            statement = "Dans quel langage de programmation les instructions if/else sont-elles utilisées pour prendre des décisions conditionnelles ?",
            response = "Plusieurs langages",
            propositions = listOf(
                "JavaScript",
                "Python",
                "C++",
                "Plusieurs langages"
            )
        ),
        Question(
            statement = "Quel est le terme utilisé pour décrire le processus de test d'un logiciel en dehors de son environnement de production ?",
            response = "Tests de non-régression",
            propositions = listOf(
                "Tests unitaires",
                "Tests de non-régression",
                "Tests d'intégration",
                "Tests de performance"
            )
        ),
        Question(
            statement = "Quel est le protocole utilisé pour sécuriser les communications sur le web en utilisant une connexion chiffrée ?",
            response = "HTTPS",
            propositions = listOf(
                "HTTP",
                "FTP",
                "SMTP",
                "HTTPS"
            )
        )
    )
}