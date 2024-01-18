/*
https://www.javatpoint.com/kotlin-integer-range
 */


fun main(args: Array<String>) {

    for (a in 1..5){
        print(a )
    }
    println()

    for(x in 'a'..'f'){
        print(x )
    }
    println()

    val range = 1.0..5.0
    println(range)
    println("3.14 in range is ${3.14 in range}")

    println()

    for (a in 5 downTo 1){
        print(a )// 54321
    }

    println()

    for (a in 1 until 5){
        print(a ) // print 1234
    }

    println()

    for (x in 1..10 step 2)
        print("$x ")

    println()
    for (x in 10 downTo 1 step 3)
        print("$x ")

    println()

    val chars = ('a'..'e')
    val it = chars.iterator()
    while (it.hasNext()) {
        val x = it.next()
        print("$x ")
    }

}