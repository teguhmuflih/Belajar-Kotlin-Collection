package app

fun main() {
    val map : Map<String, String> = mapOf(
        Pair("a","Teguh"),
        "b" to "Muflih",
        "c" to "Rizky"
    )

    for ((key,value) in map){
        println("$key to $value")
    }
}