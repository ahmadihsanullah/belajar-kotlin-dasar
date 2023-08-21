fun main() {
    val range = 1..100
    println(range.count())
    println(range.contains(50))
    println(range.contains(500))
    println(range.first)
    println(range.last)
    println(range.step)

    val rangeDown = 100 downTo 1
    println(rangeDown.count())
    println(rangeDown.contains(50))
    println(rangeDown.contains(500))
    println(rangeDown.first)
    println(rangeDown.last)
    println(rangeDown.step)

    val rangeDownWithStep = 100 downTo 1 step 2
    println(rangeDownWithStep.count())
    println(rangeDownWithStep.contains(50))
    println(rangeDownWithStep.contains(500))
    println(rangeDownWithStep.first)
    println(rangeDownWithStep.last)
    println(rangeDownWithStep.step)

}