package Advent3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Advent_3KtTest {

    val testData = "src/test/kotlin/Advent3/testData"
    @Test
    fun part1() {

        val testData = "src/test/kotlin/Advent3/testData"

        val result = part1(testData,pointsMap)
        val expected = 157

        assertEquals(expected,result)
    }

    @Test
    fun part2() {

        val result = part2(testData,pointsMap)
        val expected = 70

        assertEquals(expected,result)
    }
}