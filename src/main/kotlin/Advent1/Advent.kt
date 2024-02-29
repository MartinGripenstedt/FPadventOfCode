package Advent1

import java.io.File


fun lanternFishCounter(lista: MutableList<Int>, days : Int) : MutableList<Int> {

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


val data: List<String> =
    File("src/main/kotlin/Advent1/Data advent 1").readLines()


val lanternFishListReal: MutableList<Int> = data.flatMap { line ->
    line.split(",").map { it.trim().toInt() }

}.toMutableList()




fun main() {


    var days = 18

    val lanternFishList: MutableList<Int> = mutableListOf(3, 4, 3, 1, 2)

    while (days > 0) {

        var howManyNewFish = 0

        for (i in lanternFishList.indices) {

            if (lanternFishList[i] == 0) {
                lanternFishList[i] = 6
                howManyNewFish++
            } else {
                lanternFishList[i]--
            }

        }

        days -= 1

        repeat(howManyNewFish) {
            lanternFishList.add(8)
        }
    }
    // lanternFishList.forEach{e -> print(e) }

    println(lanternFishList.joinToString(separator = ","))

    println(days)

    println(lanternFishListReal)
    println()

 val numbers = lanternFishCounter(lanternFishListReal,200).count()

    println(numbers)

}