package Advent2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Avent2KtTest {

    @Test
    fun validPwCounter() {

        val result = validPwCounter("src/test/kotlin/Advent2/testData")
        val expected = 2

        assertEquals(expected,result)
    }
    @Test
    fun validPwCounter2() {

        val result = validPwCounter2("src/test/kotlin/Advent2/testData")
        val expected = 1

        assertEquals(expected,result)
    }

}