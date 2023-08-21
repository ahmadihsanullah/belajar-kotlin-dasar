fun main() {
    var firstName: String = "Ahmad";
    var middleName: String = "Ihsanullah";
    var lastName: String = "Rabbani";
    var fullName: String = "$firstName $middleName $lastName";
    var desc: String = "total $fullName char = ${fullName.length}";

    println(fullName);
    println(desc);
}