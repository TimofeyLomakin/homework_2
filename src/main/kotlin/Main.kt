package ru.netology

fun main() {
    println("Добашнее задание №1")
    val amount = 10000
    val commission = 0.0075
    val minCommission = 35

    if (minCommission < amount) {
        val result : Double = if (amount * commission > minCommission) amount * commission else minCommission.toDouble()
        println("Размер комиссии: " + result + " руб")
    } else {
        println("Сумма перевода не божет быть меньше коммиссии")
    }


    println("Добашнее задание №2")
    val likes = 1011
    if (likes % 10 == 1 && likes % 100 != 11) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " людям")
    }


    println("Добашнее задание №3")
    val purchase = 999
    val regular = true
    val baseDiscount = 100
    val advancedDiscount = 0.95
    var regularDiscount = 0.99

    if (regular != true) {
        regularDiscount = 1.0
    }

    if (purchase < 1001) {
        println("Итоговая стоимость покупки: " + (purchase  * regularDiscount))
    } else if (purchase > 1000 && purchase < 10001) {
        println("Итоговая стоимость покупки: " + ((purchase - baseDiscount)  * regularDiscount))
    } else {
        println("Итоговая стоимость покупки: " + (purchase * advancedDiscount * regularDiscount))
    }


}