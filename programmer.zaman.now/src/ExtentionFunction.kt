fun String.hello(): String{
    return "hello $this"
}

fun main() {
    var name = "ahmad"
    println(name.hello())

}