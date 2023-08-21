const val APP: String = "Belajat Kotlin Dasar"
const val VERSION: String = "1.1.0";

fun main() {
    //variable mutable
    var name: String = "Ahmad Ihsan";
    name = "Ahmad Ihsanullah Rabbani";
    println(name);

    //variable immutable
    val immutableName: String = "Ahmad Ihsan";
//    immutableName = "Ahmad Ihsanullah Rabbani"; //error message
    println(immutableName);

    //nullable
    var nullableName: String? = null;
//    nullableName = "ahmad";

    println(nullableName)
    println(nullableName?.length)

    //constant variable
    println("Welcome to $APP version $VERSION");
}