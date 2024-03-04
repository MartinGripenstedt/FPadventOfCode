package Advent2

import java.io.File

val data = "src/main/kotlin/Advent2/Data advent 2"


fun validPwCounter(file : String) : Int{
    var validLinesCount = 0
    val data = File(file).forEachLine {e ->

        val input = e.split(" ")

        val range = input[0].split("-").map { it.toInt() }
        val charToCheck = input[1][0]
        val stringToCheck = input[2]

        val count = stringToCheck.count { it == charToCheck }
        if (count in range[0]..range[1]) {
            validLinesCount++
        }
    }
    return validLinesCount
}

fun main() {

    println(validPwCounter(data))



    }



