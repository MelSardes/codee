package com.sardes.codee.data

data class Question(
    val statement: String,
    val response: String,
    val propositions: List<String>
)
