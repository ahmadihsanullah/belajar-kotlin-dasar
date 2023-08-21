fun main() {
    val names: Array<String> = arrayOf("ahmad", "ihsanullah","rabbani")

    //isi array masih bisa diubah, kecuali variable tidak bisa diubah
    names[0] = "budi"

    println(names[0])
    println(names[1])
    println(names.get(2))
    //array nullable
    val nullableNames: Array<String?> = arrayOfNulls(5);
    nullableNames.set(0, "budi")
    nullableNames.set(1, "budi")
    nullableNames.set(2, "budi")
    nullableNames.set(3, "budi")
    nullableNames.set(4, "budi")
    println(nullableNames[0])
}