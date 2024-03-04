package Advent1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AdventKtTest {


    @Test
    fun testLanternFishCounter() {

        val lanternFishListReal: MutableList<Int> = mutableListOf(3, 4, 3, 1, 2)
        val days = 80

        val result = lanternFishCounter(lanternFishListReal, days).count()

        val expected = 5934

        assertEquals(expected, result)
    }


}