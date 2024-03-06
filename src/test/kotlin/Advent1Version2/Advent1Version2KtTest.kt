package Advent1Version2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class Advent1Version2KtTest {

    @Test
    fun simulateDays() {

        val testData: String = File("src/test/kotlin/Advent1Version2/testData").readText()

        val testFishArray = parseInput(testData)

        val result = simulateDays(80,testFishArray).sum()

        val expected = 5934L

        assertEquals(expected,result)

    }
}