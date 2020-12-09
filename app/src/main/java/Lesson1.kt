/*Написати програму на мові Kotlin, яка буде проходити по циклу від 0 до 100 і виводити слово Piff для кожного числа, яке кратне 3, і слово Paff, для чисел, які кратні 5. Написати хоча б 2 різних варіанта реалізації.*/

fun main() {
    val firstnumber: Int = 0
    val lastnumber: Int = 100
    val div1: Int = 3
    val div2: Int = 5
    val size: Int = lastnumber - firstnumber + 1
    val arr = Array(size) { firstnumber -> (firstnumber) }

    PifPaf1(firstnumber, lastnumber, div1, div2)
    println()
    PifPaf2(firstnumber, lastnumber, div1, div2)
    println()
    PifPaf3(arr, div1, div2)

}

fun PifPaf1(firstnumber: Int, lastnumber: Int, div1: Int, div2: Int) {
    var currentnumber: Int = firstnumber

    println("Version1 --------")

    while (currentnumber <= lastnumber) {
        if (currentnumber % div1 == 0 && currentnumber % div2 == 0) {
            println("$currentnumber : PifPaf")
        } else if (currentnumber % div2 == 0) {
            println("$currentnumber : Paf")
        } else if (currentnumber % div1 == 0) {
            println("$currentnumber : Pif")
        } else println("$currentnumber")
        currentnumber++
    }
}

fun PifPaf2(firstnumber: Int, lastnumber: Int, div1: Int, div2: Int) {

    println("Version2 --------")

    for (firstnumber in (firstnumber..lastnumber)) {
        if (firstnumber % div1 == 0 && firstnumber % div2 == 0) {
            println("$firstnumber : PifPaf")
        } else if (firstnumber % div2 == 0) {
            println("$firstnumber : Paf")
        } else if (firstnumber % div1 == 0) {
            println("$firstnumber : Pif")
        } else println("$firstnumber")
    }
}

fun PifPaf3(arr: Array<Int>, div1: Int, div2: Int) {

    println("Version3 --------")

    arr.forEach {
        if (it % div1 == 0 && it % div2 == 0) {
            println("$it : PifPaf")
        } else if (it % div2 == 0) {
            println("$it : Paf")
        } else if (it % div1 == 0) {
            println("$it : Pif")
        } else {
            println(it)
        }
    }

}
