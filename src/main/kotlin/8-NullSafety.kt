/*
https://www.javatpoint.com/kotlin-nullable-and-non-nullable-types
https://www.javatpoint.com/kotlin-elvis-operator
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

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)


    withoutElvishOperator()
    withElvishOperator()
}

fun withoutElvishOperator(){
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = if (str != null) str.length else -1
    var len2:  Int = if (str2 != null) str2.length else -1
    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}

fun withElvishOperator(){
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1:  Int = str ?.length ?: -1
    var len2:  Int = str2 ?.length ?:  -1

    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}