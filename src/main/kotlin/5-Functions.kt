/*
https://www.javatpoint.com/kotlin-function
 */

fun main(args: Array<String>){
    sum()
    println("code after sum")

    val result = sum(5, 6)
    println(result)

    println("Recursion ")
    recursion(0)

    val number = 5
    val resultFact: Long = recursiveFactorial(number)
    println("Factorial of $number = $resultFact")


    // This will produce -> Exception in thread "main" java.lang.StackOverflowError
//    var resultRecSum = recursiveSum(100000)
//    println(resultRecSum)

    // Tail Recursion will solve the problem
    /*
    Tail recursion is a recursion which performs the calculation first, then makes the recursive call.
    The result of current step is passed into the next recursive call.

    Tail recursion follows one rule for implementation. This rule is as follow:
    The recursive call must be the last call of the method.
    To declare a recursion as tail recursion we need to use tailrec modifier before the recursive function.
     */

    var resultRecSum = recursiveSum(100000.toLong(), 0)
    println("sum of upto 100000 number = $resultRecSum")

    val myLambda : (Int) -> Unit = { result:Int -> println(result ) }
    sumHighLevelLambda(5, 10, myLambda)
}

fun sum(){
    var num1 =5
    var num2 = 6
    println("sum = "+(num1+num2))
}

fun sum(number1: Int, number2:Int): Int{
    val add = number1 + number2
    return add
}

fun recursion(count:Int){
    var count = count
    count++
    if (count >=5 ) return
    println("Hello $count")
    recursion(count)
}

fun recursiveFactorial(n:Int):Long{
    return if(n == 1) n.toLong()
    else n * recursiveFactorial(n-1)
}

// This will produce -> Exception in thread "main" java.lang.StackOverflowError
fun recursiveSum(n: Long) : Long {
    return if (n <= 1) n
    else n + recursiveSum(n - 1)
}

tailrec fun recursiveSum(n: Long, semiResult: Long = 0) : Long {
    return if (n <= 0) semiResult
    else recursiveSum( (n - 1), n + semiResult)
}

fun sumHighLevelLambda(a:Int, b:Int, myLambda:(Int) -> Unit){
    val result = a+b
    myLambda(result)
}