package app


fun main() {
//    for (value in listOf("Teguh","Muflih","Rizky")){
//        println(value)
//    }

    listOf("Teguh","Muflih","Rizky").forEach {
        println(it)
    }
    listOf("Teguh","Muflih","Rizky").forEachIndexed { index, value ->
        println("$index : $value")
    }
}