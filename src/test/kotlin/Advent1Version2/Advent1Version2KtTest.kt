package Advent1Version2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Advent1Version2KtTest {

    @Test
    fun simulateDays() {

        val testFishArray = longArrayOf(0, 1, 1, 2, 1, 0, 0, 0, 0)



        val result = Advent1Version2.simulateDays(80,testFishArray).sum()

        val expected = 5934L

        assertEquals(expected,result)


    }
}