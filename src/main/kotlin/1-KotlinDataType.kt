/*
https://www.javatpoint.com/kotlin-data-type
 */

fun main(args : Array<String>){

    // in kotlin everything is OBJECT. No primitive types like java

    /*
    Kotlin built in data type are categorized as following different categories:

        Number
        Character
        Boolean
        Array
        String
     */

    // array
    val id = arrayOf(1,2,3,4,5)
    val firstId = id[0]
    val lasted = id[id.size-1]

    id.forEach { i -> println(i) }

    val asc = Array(5) { i -> i * 2 } //asc[0,2,4,6,8]

    val text = "Hello, String"
    println(text)

    asc.forEach { i -> println(i) }

    // String is immutable. String are categorize into two types. These are: Escaped String & Row String:

    val escapedString = "Hello, World\n"
    println(escapedString)

    val rowString ="""  
             Welcome   
                To  
              Kotlin 
    """
    println(rowString)

}
