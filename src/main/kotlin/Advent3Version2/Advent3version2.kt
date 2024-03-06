package Advent3Version2

import java.io.File

// Day 3 year 2022
//inspo : https://todd.ginsberg.com/post/advent-of-code/2022/day3/

val filePath = "src/main/kotlin/Advent3/Data advent 3"

fun part2V1(file: String ): Int {

    var totalPoints = 0
    val lines = File(file).readLines()


    lines.forEach { line ->


        val half = line.length / 2

        val firstHalf = line.substring(0, half).toSet()

        val secondHalf = line.substring(half).toSet()

        val commonCharacters = firstHalf.intersect(secondHalf).first()

        val points = commonCharacters.priority()
        totalPoints += points

    }

    return totalPoints
}
fun part2V2(file: String ): Int {

    var totalPoints = 0
    val lines = File(file).readLines()

    lines.chunked(3).forEach { e ->       //.chunked plockar ut 3 rader som en "chunk"

        val commonCharacters = e.map { it.toSet() }
            .reduce { left, right -> left intersect right }
            .first()

        val points = commonCharacters.priority()
        totalPoints += points

    }

    return totalPoints
}

fun main() {
    println(part2V1(filePath))
   println(part2V2(filePath))
}

fun Char.priority(): Int =                  //  <- lite snyggare lösning än min "pointsMap" kan man säga
    when (this) {
        in 'a'..'z' -> (this - 'a') + 1
        in 'A'..'Z' -> (this - 'A') + 27
        else -> 0
    }