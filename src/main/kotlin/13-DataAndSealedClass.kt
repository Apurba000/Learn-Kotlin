/*
https://www.javatpoint.com/kotlin-data-class
https://www.javatpoint.com/kotlin-sealed-class
 */

/*
Declaring a data class must contain at least one primary constructor with property argument (val or var).

Data class internally contains the following functions:

    1. equals(): Boolean
    2. hashCode(): Int
    3. toString(): String
    4. component() functions corresponding to the properties
    5. copy()

    Due to presence of above functions internally in data class, the data class eliminates the boilerplate code.

    A comparison between java data class and kotlin data class

    Java :
    public class User {
        private String name;
        private int id;
        private String email;

        public User(String name, int id, String email) {
            this.name = name;
            this.id = id;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return getId() == user.getId() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getEmail(), user.getEmail());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getId(), getEmail());
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", email='" + email + '\'' +
                    '}';
            }
        }

        Now call the data class :

    class MyClass{
            public static void main(String agrs[]){
                User u = new User("Ashu",101,"mymail@mail.com");
                System.out.println(u);
            }
     }


    The above Java data class code is rewritten in Kotlin data code in single line as
 */

data class User(var name: String, var id: Int, var email: String)

fun main(agrs: Array<String>) {
    val u = User("Ashu", 101, "mymail@mail.com")
    println(u)


    println()

    val p1 = Product("laptop", 25000)
    val p2 = Product("laptop", 25000)
    println(p1 == p2)
    println(p1.equals(p2))

    val p1d = ProductData("laptop", 25000)
    val p2d = ProductData("laptop", 25000)
    println(p1d == p2d)
    println(p1d.equals(p2d))

    println()

    val p1c = ProductData("laptop", 25000)
    println("p1c object contain data : $p1c")
    val p2c = p1c.copy()
    println("p2c copied object contains default data of p1c: $p2c")
    val p3c = p1c.copy(price = 20000)
    println("p3c contain altered data of p1c : $p3c")

    println()

    val p1default = ProductDefault(price = 20000)
    println(p1default)


    // Sealed Class
    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)
}

/*
    Requirement of data class :
    In order to create a data class, we need to fulfill the following requirements:

    1. Contain primary constructor with at least one parameter.
    2. Parameters of primary constructor marked as val or var.
    3. Data class cannot be abstract, inner, open or sealed.
    4. Before 1.1,data class may only implements interface. After that data classes may extend other classes.
 */

// Normal class
class Product(var item: String, var price: Int)
data class ProductData(var item: String, var price: Int)
data class ProductDefault(var item: String = "laptop", var price: Int = 25000)







/*
Sealed Class :
A sealed class is implicitly an abstract class which cannot be instantiated.
Sealed classes are commonly used with when expression.
As the subclasses of sealed classes have their own types act as a case.
Due to this, when expression in sealed class covers all the cases and avoid to add else clause.
 */
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square ->println("Square area is ${e.length*e.length}")
        is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
        //else -> "else case is not require as all case is covered above"
    }

