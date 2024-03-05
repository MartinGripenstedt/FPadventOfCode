package Advent3Version2

import java.io.File

fun main() {
    var totalPoints = 0
    val lines = File("src/main/kotlin/Advent3/Data advent 3").readLines()

    // Process lines in chunks of 3
    lines.chunked(3).forEach { chunk ->
        if (chunk.size == 3) { // Ensure the chunk has exactly 3 lines
            val commonCharacters = chunk.map { it.toSet() }
                .reduce { acc, set -> acc intersect set }
                .firstOrNull() // Get the first common character

            commonCharacters?.let {
                val points = it.priority() // Calculate priority using the new method
                totalPoints += points
            }
        }
    }

    println(totalPoints)
}

fun Char.priority(): Int =
    when (this) {
        in 'a'..'z' -> (this - 'a') + 1
        in 'A'..'Z' -> (this - 'A') + 27
        else -> 0
    }