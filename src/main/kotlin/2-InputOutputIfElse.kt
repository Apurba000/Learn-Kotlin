import java.util.*

/*
https://www.javatpoint.com/kotlin-input-output
https://www.javatpoint.com/kotlin-if-expression
 */

fun main(args : Array<String>){

    //The methods print() and println() are internally call System.out.print() and System.out.println() respectively.
    println("Hello World!")
    print("Welcome to  kotlin")
    println()

    println("Enter your name")
    val name = readLine()
    println("Enter your age")
    val age: Int =Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")

    println("Using Scanner")
    // using scanner object
    val read = Scanner(System.`in`)
    println("Enter your age")
    val age2 = read.nextInt()
    println("Your input age is $age2")


    val res = if (1<2){
        println("hello")
        "return from if"
    }else{
        println("hi")
        "return from else"
    }
    println("res = $res")
}