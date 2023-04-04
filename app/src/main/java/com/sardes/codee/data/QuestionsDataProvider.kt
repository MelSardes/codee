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
    )
}