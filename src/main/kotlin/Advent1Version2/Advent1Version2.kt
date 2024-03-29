package Advent1Version2

import java.io.File

//day 6 year 2021
// Inspo : https://todd.ginsberg.com/post/advent-of-code/2021/day6/

val data: String = File("src/main/kotlin/Advent1/Data advent 1").readText()


val longArrayFishes = parseInput(data)

 fun parseInput(input: String): LongArray = LongArray(9).apply {
    input.split(",").map { it.toInt() }.forEach { this[it]++ }
}

fun LongArray.rotateLeftManually() {       //extension

    val firstElement = this[0]

    for (i in 1 until this.size) {
        this[i - 1] = this[i]
    }

    this[this.lastIndex] = firstElement
}

fun simulateDays(days: Int, fishArray: LongArray ): LongArray {
    repeat(days) {
        fishArray.rotateLeftManually()
        fishArray[6] += fishArray[8]
    }
    return fishArray
}

fun main() {

    simulateDays(256, longArrayFishes)

    println(longArrayFishes.sum())

}