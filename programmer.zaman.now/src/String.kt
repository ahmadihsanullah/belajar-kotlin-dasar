fun main() {
    var firstName = "Ahmad";
    var middleName: String = "Ihsanullah";
    var lastName: String = "Rabbani";
    var address: String = """
        >JL.Semangka V No 5, Perumanas II
        >Parungpanjang. Kab.Bogor Jawa Barat
        >16360
    """.trimMargin(">")

    var hello: String = """"
        |Hello %s
        |apa kabar bro
        |aku %s tahun
    """.trimMargin()

    println(firstName +" " + middleName+ " " + lastName);
    println(address);
    println(hello.format("ana", 18));
}