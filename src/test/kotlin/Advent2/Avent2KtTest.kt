package Advent2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Avent2KtTest {

    @Test
    fun validPwCounter() {

        val result = Advent2.validPwCounter("src/test/kotlin/Advent2/testData")
        val expected = 2

        assertEquals(expected,result)
    }
}