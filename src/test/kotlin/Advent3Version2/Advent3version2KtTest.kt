package Advent3Version2

import Advent3.part2
import Advent3.pointsMap
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Advent3version2KtTest {

    val testData = "src/test/kotlin/Advent3/testData"

    @Test
    fun part2V1() {
        val result = part2V1(testData)
        val expected = 157

        assertEquals(expected,result)
    }

    @Test
    fun part2V2() {
        val result = part2V2(testData)
        val expected = 70

        assertEquals(expected,result)
    }
}