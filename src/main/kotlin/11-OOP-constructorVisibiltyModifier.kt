
class MyClassPrimaryConstructor(name: String, id: Int) {
    val e_name: String
    var e_id: Int

    init{
        e_name = name
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}

class MyClassSecondaryConstructor{
    constructor(id: Int){
        println("Id = ${id}")
    }


    constructor(name: String, id: Int) : this(id){
        println("Name = ${name}")
    }
}


open class Parent{

    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : this(name, id){
        println("Password = ${pass}")
    }
}

class Child : Parent {

    constructor(name: String, id: Int, pass: String):super(name, id, "password"){
        println("Hello From Child")
    }
}

open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() { } // visible to the Base and the Derived class
}

class Derived: Base() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}


fun main(args: Array<String>){
    val myclass = MyClassPrimaryConstructor ("Ashu", 101)
    val myClassSC = MyClassSecondaryConstructor("Apurba", 10)
    val obj = Child("Apurba Biswas", 958, "dontKnow")
}