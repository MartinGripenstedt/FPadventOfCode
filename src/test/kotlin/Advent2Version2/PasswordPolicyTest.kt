package Advent2Version2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PasswordPolicyTest {

    @Test
    fun isValid() {
        val policy = PasswordPolicy(1..3, 'a', "abcde")
        val policy = PasswordPolicy(1..3, 'b', "cdefg")


    }

    @Test
    fun isValidPart2() {
    }
}