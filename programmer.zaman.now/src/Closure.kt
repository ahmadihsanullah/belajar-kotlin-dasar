fun main() {
    var counter = 0;

    val lambdaIncrement: ()->Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousFunction = fun(){
        println("anonymous increment")
        counter++
    }

    fun functionIncrement(){
        println("function increment")
        counter++
    }

    lambdaIncrement()
    anonymousFunction()
    functionIncrement()
    lambdaIncrement()
    anonymousFunction()
    functionIncrement()

    println(counter)
}