/*
https://www.javatpoint.com/kotlin-when-expression
https://www.javatpoint.com/kotlin-for-loop
 */

fun main(args:Array<String>){
    whenExpression()
    forLoop()
    whileLoop()
    doWhileLoop()
}

fun whenExpression(){
    //Kotlin, when expression is a conditional expression which returns the value. Kotlin, when expression is replacement of switch statement
    var number = 4
    var numberProvided = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")

    when(number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }

    number = 8
    when(number) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }

    number = 7
    when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}

fun forLoop(){
    //Kotlin for loop is equivalent to the foreach loop in languages like C#
    val marks = arrayOf(80,85,60,90,70)
    for(item in marks){
        println(item)
    }

    for(item in marks.indices)
        println("marks[$item]: "+ marks[item])

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print("$i ")
    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print("$i ")
    println()

    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print("$i ")
    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print("$i ")
    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print("$i ")
    println()
}

fun whileLoop(){
    var i = 1
    while (i<=5){
        println("$i ")
        i++
    }

    while (true){
        println("infinite loop")
        i++
        if (i == 10) break
    }
}

fun doWhileLoop(){
    var i = 1
    do {
        println(i)
        i++
    }
    while (i<=5);

    i = 6
    do {
        println(i)
        i++
    }
    while (i<=5);
}