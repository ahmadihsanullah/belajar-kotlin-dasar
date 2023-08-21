infix fun String.to(type: String): String {
    return if(type == "UP") this.uppercase() else this.lowercase()
}

fun main() {
    val result: String = "ahmad" to "aP"
    println(result)
}