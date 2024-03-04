package Advent1

import java.io.File

val data: List<String> = File("src/main/kotlin/Advent1/Data advent 1").readLines()

val lanternFishListReal: MutableList<Int> = data.flatMap { line ->
    line.split(",").map { it.trim().toInt() } }.toMutableList()

fun lanternFishCounter(lista: MutableList<Int>, days: Int): MutableList<Int> {

    var daysReal = days
    
    while (daysReal > 0) {

        var howManyNewFish = 0

        for (i in lista.indices) {

            if (lista[i] == 0) {
                lista[i] = 6
                howManyNewFish++
            } else {
                lista[i]--
            }

        }
        daysReal -= 1

        repeat(howManyNewFish) {
            lista.add(8)
        }
    }
    return lista
}
fun main() {

    val numbers = lanternFishCounter(lanternFishListReal, 80).count()

    println(numbers)
}