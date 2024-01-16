/*
https://www.javatpoint.com/kotlin-exception-handling
 */

fun main(args : Array<String>){
    /*
     In Kotlin, all exception classes are descendants of class Throwable.
     To throw an exception object, Kotlin uses the throw expression.

     There are four different keywords used in exception handling. These are:
        try
        catch
        finally
        throw
     */

    try {
        val data = 20 / 0  //may throw exception
    } catch (e: ArithmeticException) {
        println(e)
    }
    println("code below exception...")

    val str = getNumber("10")
    println(str)

    multipleCatchBlock()

    finallyBlock()

    throwExpression(15)
}

fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: ArithmeticException) {
        0
    }
}

fun multipleCatchBlock(){
    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }
    println("code after try catch...")
}

fun finallyBlock(){
    try {
        val data = 5 / 0
        println(data)
    } catch (e: ArithmeticException) {
        println(e)
    } finally {
        println("finally block always executes")
    }
    println("below codes...")
}

fun throwExpression( age: Int){
    if (age < 18) throw ArithmeticException("under age")
    else println("eligible for drive")
}