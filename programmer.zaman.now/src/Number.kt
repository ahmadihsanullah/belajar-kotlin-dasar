fun main() {
    //Integer Number
    var age: Byte  =30;
    var height: Int = 170;
    var distance: Short = 2000;
    var balance: Long = 2000000L;

    println(age);
    println(height);
    println(distance);
    println(balance);

    //Floating Point Number
    var value: Float = 10.10F;
    var radius: Double = 2313419.8192012;

    println(value);
    println(radius);

    //Literals Number
    var binary: Int = 0b01010001;

    println(binary);

    //Underscore Separators
    var price: Long = 9_000_000_000L;

    //conversion numbers
    var priceInt: Int = price.toInt();
    println(priceInt);

    var priceShort: Short = price.toShort();
    println(priceShort);
}