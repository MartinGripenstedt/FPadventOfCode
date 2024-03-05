package Advent3
import java.io.File


val pointsMap = mapOf(
    'a' to 0, 'b' to 1, 'c' to 2, 'd' to 3, 'e' to 4,
    'f' to 5, 'g' to 6, 'h' to 7, 'i' to 8, 'j' to 9,
    'k' to 10, 'l' to 11, 'm' to 12, 'n' to 13, 'o' to 14,
    'p' to 15, 'q' to 16, 'r' to 17, 's' to 18, 't' to 19,
    'u' to 20, 'v' to 21, 'w' to 22, 'x' to 23, 'y' to 24,
    'z' to 25, 'A' to 26, 'B' to 27, 'C' to 28, 'D' to 29,
    'E' to 30, 'F' to 31, 'G' to 32, 'H' to 33, 'I' to 34,
    'J' to 35, 'K' to 36, 'L' to 37, 'M' to 38, 'N' to 39,
    'O' to 40, 'P' to 41, 'Q' to 42, 'R' to 43, 'S' to 44,
    'T' to 45, 'U' to 46, 'V' to 47, 'W' to 48, 'X' to 49,
    'Y' to 50, 'Z' to 51
)

    fun part2(file: String , map : Map<Char,Int>): Int {

        var totalPoints = 0

        val data = File(file).readLines()

        for (i in data.indices step 3) {

            val foundCharacter = data[i].toList().intersect(data[i + 1].toList()).intersect(data[i + 2].toList())

            val points = map[foundCharacter.first()]

            if (points != null) {
                totalPoints += points + 1
            }
        }

        return totalPoints

    }
fun main() {


    val data = "src/main/kotlin/Advent3/Data advent 3"

    println( part2(data,pointsMap))

    var totalPoints = 0

    File("src/main/kotlin/Advent3/Data advent 3").forEachLine { line ->

        val half = line.length / 2

        val firstHalf = line.substring(0, half).toList()

        val secondHalf = line.substring(half).toList()

        val foundCharacter = firstHalf.intersect(secondHalf)

        val points = pointsMap[foundCharacter.first()]

        if (points != null) {
            totalPoints += points + 1
        }
    }
    println(totalPoints)
}