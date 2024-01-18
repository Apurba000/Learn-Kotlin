/*
https://www.javatpoint.com/kotlin-extension-function
 */


/*
Kotlin extension function provides a facility to "add" methods to class without inheriting a class
or using any type of design pattern. The created extension functions are used as a regular
function inside that class.
 */

class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}

fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}

fun MutableList<Int>?.swap(index1: Int, index2: Int):Any {
    if (this == null) return "null"

    val tmp = this[index1] // 'this' represents to the list
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}


fun main(args: Array<String>){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")

    println()

    val list = mutableListOf(5,10,15)
    println("before swapping the list :$list")

    val result = list.swap(0, 2)
    println("after swapping the list :$result")

    println()

    val instance = MyClass.create()
    println(instance)
    MyClass.helloWorld()
}

/*
A companion object is an object which is declared inside a class and marked with the companion keyword.
Companion object is used to call the member function of class directly using the class name (like static in java).
 */

class MyClass {
    companion object {
        fun create():String{
            return "calls create method of companion object"
        }
    }
}
fun MyClass.Companion.helloWorld() {
    println("executing extension of companion object")
}