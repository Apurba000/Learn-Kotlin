/*
https://www.javatpoint.com/kotlin-inheritance
 */

open class Bird {
    open var color = "Black"

    open fun fly() {
        println("Bird is flying...")
    }
}

class Parrot: Bird() {
    override var color = "Green"

    override fun fly() {
        println("Parrot is flying...")
    }
}

class Duck: Bird() {
    override var color = "White"

    override fun fly() {
        println("Duck is flying...")
    }
}

interface Hawk{
    fun fly() {
        println("Hawk is flying...")
    }
}

class Eagle : Bird(), Hawk{
    override var color = "Black"

    override fun fly() {
        super<Bird>.fly()
        super<Hawk>.fly()
        println("Eagle is flying...")
    }
}






fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)

    val duck = Duck()
    duck.fly()
    println(duck.color)

    println()

    val eagle = Eagle()
    eagle.fly()
    println(eagle.color)

    println()

    val car = Car()
    car.run()
    val city = City()
    city.run()

    println()

    val d = D()
    d.doSomething()
    d.absMethod()
}







/*
    Abstraction
*/

open class Car {
    open fun run() {
        println("Car is running..")
    }
}
abstract class Honda : Car() {
    abstract override fun run()
}
class City: Honda(){
    override fun run() {
        println("Honda City is running..")
    }
}



interface MyInterface1 {
    fun doSomething() {
        println("MyInterface 1 doing some work")
    }
    fun absMethod()
}

interface MyInterface2 {
    fun doSomething() {
        println("MyInterface 2 doing some work")
    }
    fun absMethod() {
        println("MyInterface 2 absMethod")
    }
}

class D : MyInterface1, MyInterface2 {
    override fun doSomething() {
        super<MyInterface1>.doSomething()
        super<MyInterface2>.doSomething()
    }

    override fun absMethod() {
        super.absMethod()
    }
}

