
/*
https://www.javatpoint.com/kotlin-class-and-object
 */



class Account {
    var acc_no: Int = 0
    var name: String =  ""
    var amount: Float = 0.toFloat()

    fun insert(ac: Int,n: String, am: Float ) {
        acc_no = ac
        name = n
        amount = am
        println("Account no: ${acc_no} holder :${name} amount :${amount}")
    }

    fun deposit() {
        //deposite code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        //balance check code
    }
}


class OuterClass{
    private var name: String = "Ashu"

    class NestedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101

        fun foo(){
            //  print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }

    inner class InnerClass{
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo(){
            println("name is ${name}") // access the outer class member even private
            println("Id is ${id}")
        }
    }
}

fun main(args: Array<String>){
    Account()
    var acc= Account()
    acc.insert(832345,"Ankit",1000f) //accessing member function
    println("${acc.name}") //accessing class property

    println(OuterClass.NestedClass().description) // accessing property
    var obj = OuterClass.NestedClass() // object creation
    obj.foo() // access member function

    println()

    println(OuterClass().InnerClass().description) // accessing property
    var obj1 = OuterClass().InnerClass() // object creation
    obj1.foo() // access member function
}


