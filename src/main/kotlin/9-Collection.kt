/*
https://www.javatpoint.com/kotlin-collections
 */

/*
    Kotlin collections are broadly categories into two different forms. These are:

    1. Immutable Collection (or Collection) -  read only functionalities
    2. Mutable Collection - both read and write functionalities.
 */

fun main(args: Array<String>) {
    // immutable list
    println(" *********** IMMUTABLE LIST EXAMPLE *************")
    listEx()

    // Mutable list
    println(" *********** MUTABLE LIST EXAMPLE *************")
    mutableListEx()
}

fun listEx(){
    var list = listOf("Ajay", "Vijay", "Prakash")//read only, fix-size
    for (element in list) {
        println(element)
    }
    println()
    for(index in 0..list.size-1){
        println(list[index])
    }

    var intList: List<Int> = listOf<Int>(1,2,3)
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash","Vijay","Rohan")
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
    var listStr: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    println("print int list")
    for(element in intList){
        println(element)
    }
    println()
    println("print string list")
    for(element in stringList){
        println(element)
    }
    println()
    println("print any list")
    for(element in anyList){
        println(element)
    }


    for(element in stringList){
        print("$element ")
    }
    println()
    println(stringList[0])
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(listStr))
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))
}

fun mutableListEx(){
    var mutableList = mutableListOf<String>()

    mutableList.add("Ajay") // index 0
    mutableList.add("Vijay") // index 1
    mutableList.add("Prakash") // index 2

    var mutableList2 = mutableListOf<String>("Rohan","Raj")
    var mutableList3 = mutableListOf<String>("Dharmesh","Umesh")
    var mutableList4 = mutableListOf<String>("Ajay","Dharmesh","Ashu")

    println(".....mutableList.....")
    for(element in mutableList){
        println(element)
    }
    println(".....mutableList[2].....")
    println(mutableList[2])
    mutableList.add(2,"Rohan")
    println("......mutableList.add(2,\"Rohan\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.add("Ashu")
    println(".....mutableList.add(\"Ashu\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(1,mutableList3)
    println("... mutableList.addAll(1,mutableList3)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(mutableList2)
    println("...mutableList.addAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.remove("Vijay")
    println("...mutableList.remove(\"Vijay\")....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAt(2)
    println("....mutableList.removeAt(2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAll(mutableList2)
    println("....  mutableList.removeAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }

    println("....mutableList.set(2,\"Ashok\")....")
    mutableList.set(2,"Ashok")
    for(element in mutableList){
        println(element)
    }

    println(".... mutableList.retainAll(mutableList4)....")
    mutableList.retainAll(mutableList4)
    for(element in mutableList){
        println(element)
    }
    println(".... mutableList2.clear()....")
    mutableList2.clear()

    for(element in mutableList2){
        println(element)
    }
    println(".... mutableList2 after mutableList2.clear()....")
    println(mutableList2)

    println("....mutableList.subList(1,2)....")
    println(mutableList.subList(1,2))
}