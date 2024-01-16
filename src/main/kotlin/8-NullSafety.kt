/*
https://www.javatpoint.com/kotlin-nullable-and-non-nullable-types
 */

fun main(args: Array<String>){
    var str: String? = "Hello" // variable is declared as nullable
    str = null
    print(str)

    var str1: String? = "Hello"     // variable is declared as nullable
    var len = if(str1 != null) str1.length else -1
    println("str1 is : $str1")
    println("str1 length is : $len")

    str1 = null
    println("str1 is : $str1")
    len = if(str1 != null) str1.length else -1
    println("b length is : $len")

    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj !is String) println("obj is not string")
    else
    // No Explicit Casting needed.
    println("String length is ${obj.length}")
}