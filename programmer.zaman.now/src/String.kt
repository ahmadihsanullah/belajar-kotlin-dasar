fun main() {
    var firstName: String = "Ahmad";
    var middleName: String = "Ihsanullah";
    var lastName: String = "Rabbani";
    var address: String = """
        >JL.Semangka V No 5, Perumanas II
        >Parungpanjang. Kab.Bogor Jawa Barat
        >16360
    """.trimMargin(">")

    println(firstName +" " + middleName+ " " + lastName);
    println(address);
}