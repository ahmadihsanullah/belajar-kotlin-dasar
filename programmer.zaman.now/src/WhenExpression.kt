fun main() {
    var nilai: String = "A";

    when(nilai){
        "A" ->{
            println("Amazing")
        };
        "B" ->{
            println("Good")
        };
        "C" ->{
            println("Not Bad")
        };
        "D" ->{
            "Bad"
        };
        else->{
            println("Ups");
        }
    }

    //grouping
    when(nilai){
        "A","B","C" -> println("Selamat anda lulus");
        else -> println("Anda tidak lulus");
    }

    //inoperator
    nilai = "E";
    val nilaiLulus: Array<String> = arrayOf("A","B","C");
    when(nilai){
        in nilaiLulus -> println("Selamat anda lulus");
        !in nilaiLulus -> println("anda tidak lulus");
    }

//    is operator
    val name: String = "Ahmad";
    when(name){
        is String -> println("name is string");
        !is String -> println("name is not string");
    }

    //when sebagai penggati if else
    val nilaiUjian: Int = 40;
    var nilaiSebenarnya: Int = 80;
    var max: Int = 0;
    max = if (nilaiUjian > nilaiSebenarnya) nilaiSebenarnya else nilaiUjian
    println(max)
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 60 -> println("Good Job")
        else -> println("coba lagi tahun depan")
    }
}