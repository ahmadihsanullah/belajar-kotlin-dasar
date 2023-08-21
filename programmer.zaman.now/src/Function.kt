fun helloWorld(name: String?) = println("hello ${if (name == null) "" else name}")

fun sayHello(firstName: String, lastName: String?){
    if(lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}


fun defaultArgumen(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

//named argument
fun namedArgumen(firstName: String, middleName: String,lastName: String){
    println("Hello $firstName $middleName $lastName")
}

//return value
fun sum(a: Int, b: Int): Int{
    return a + b
}

//single expression function
fun hi(name: String?) =  println("hi $name")

fun main() {
    helloWorld(null)
    sayHello("Budi","Nugraha")
    sayHello("Bayu",null)
    defaultArgumen("Aji","Ayub")
    defaultArgumen("Aji")
    namedArgumen(
        firstName = "ahmad",
        lastName = "Rabbani",
        middleName = "Ihsanullah"
    )

    var nilai: Int = sum(2,3)
    println(nilai)
    hi("Eko")
}