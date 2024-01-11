/*
https://www.javatpoint.com/kotlin-return-and-jump
https://www.javatpoint.com/kotlin-continue-structure
 */

fun main(args:Array<String>){
    /*
    There are three jump expressions in Kotlin. These jump expressions are used for control the flow of program execution. These jump structures are:

        break
        continue
        return
     */

    breakStatement()
    continueStatement()
}

fun breakStatement(){
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    /*
    Kotlin Labeled break Expression :

    Labeled is the form of identifier followed by the @ sign,
    for example abc@, test@. To make an expression as label,
    we just put a label in front of expression.
     */

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }


    println("another Label Example")
    loopOuter@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loopOuter
        }
    }
}

fun continueStatement(){
    /*
    Kotlin, continue statement is used to repeat the loop. It continues the current flow of the program and skips the remaining code at specified condition.
    The continue statement within a nested loop only affects the inner loop.
     */

    println("Continue statement")
    for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("this is below if and i is $i")
    }

    println("Continue statement Example 2 : ")
    labelName@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@labelName
            }
            println("this is below if")
        }
    }

}