fun hitungTotalWithArray(values: Array<Int>):Int {
    var total = 0

    for(value in values) {
        total += value
    }

    return total
}

fun hitungTotalWithVararg(vararg nilai: Int):Int {
    var total = 0

    for(value in nilai) {
        total += value
    }

    return total
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}


fun main() {
    var array = arrayOf(10,10,10,10)
    println(hitungTotalWithArray(array))

    println(hitungTotalWithVararg(10,10,10,10))

    var list = asList(10,10,10,10)
    println(asList(list))
    println(asList(asList("a","b","c","d","e","f")))
}