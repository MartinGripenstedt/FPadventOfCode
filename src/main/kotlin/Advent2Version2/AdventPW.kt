package Advent2Version2

import java.io.File


data class PasswordPolicy(val range: IntRange, val letter: Char, val password: String) {

    fun isValid(): Boolean = password.count { it == letter } in range

    fun isValidPart2(): Boolean {
                                                                 /* IntRange är en range mellan två Ints i vanliga fall, men i detta fall så
                                                                 används det som två positioner (därav .first och .last)
                                                                 */
        val position1 = (password[range.first - 1] == letter)
        val position2 = (password[range.last - 1] == letter)

        return position1 xor position2        /* xor , kollar två booleans or retunerar true om ena är true och andra false (eller tvärtom)
                                         Och retunerar false om båda booleans är likadana så t.ex true + true eller false + false
                                         */
    }

}

fun main() {
    val filePath = "src/main/kotlin/Advent2/Data advent 2"
    var validPWCountPart1 = 0
    var validPWCountPart2 = 0

    File(filePath).forEachLine { line ->
        val parts = line.split(" ")
        val rangeParts = parts[0].split("-").map { it.toInt() }
        val range = rangeParts[0]..rangeParts[1]
        val letter = parts[1][0]
        val password = parts[2]

        val policy = PasswordPolicy(range, letter, password)
        if (policy.isValid()) {
            validPWCountPart1++
        }
        if (policy.isValidPart2()) {
            validPWCountPart2++
        }

    }

    println("part 1 $validPWCountPart1")
    println("part 2  $validPWCountPart2")
}