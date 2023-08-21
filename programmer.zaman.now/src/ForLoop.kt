fun main() {
    val names: Array<String>  = arrayOf("Ahmad","Ihsanullah","Rabbani")
    var total = 0
    // perulangan untuk mendapatkan index
    for (name in names.indices) {
        println("${names[name]} index ke-${name}")
        total++
    }

    println("Total perulangan ada ${total}")

    //perulangan menggunakan range
    for(i in 0..100){
//        println(i)
    }
    for (odd in 0..100 step 2){
//        println(odd)
    }
    for (odd in 100 downTo 0 step 2){
//        println(odd)
    }

    //with Index -> get index & value
    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}