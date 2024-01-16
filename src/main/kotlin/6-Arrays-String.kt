/*
https://www.javatpoint.com/kotlin-array
https://www.javatpoint.com/kotlin-string
 */

fun main(args: Array<String>) {
    /*
    Kotlin String Equality :
    In Kotlin, strings equality comparisons are done on the basis of
    structural equality (==) and referential equality (===).
    In structural equality two objects have separate instances in memory but contain same value.
    Referential equality specifies that two different references point the same instance in memory.
     */
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"
    println(str1 == str2) // true
    println(str1 != str2) // false

    // Referential equality (===)
    /*
    To check the two different references point to the same instance,
    we use === operator. The !== operator is used for negation.
    a === b specifies true if and only if a and b both point to the same object.
     */
    val str3 = buildString { "string value" }
    val str4 = buildString { "string value" }
    println(str3 === str4) // false
    println(str3 !== str4) // true
}