package Advent2Version2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PasswordPolicyTest {

    @Test
    fun pwCOunterV2Part1() {

        val testDataFile = "src/test/kotlin/Advent2/testData"

        val result = pwCounterV2Part1(testDataFile)

        val expected = 2

        assertEquals(expected,result)
    }

    @Test
    fun pwCOunterV2Part2() {
        val testDataFile = "src/test/kotlin/Advent2/testData"

        val result = pwCounterV2Part2(testDataFile)

        val expected = 1

        assertEquals(expected,result)
    }
}