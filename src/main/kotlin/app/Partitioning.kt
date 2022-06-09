package app

fun main() {
    val list: List<String> = listOf("teguh","muflih","rizky")

//    val pair: Pair<List<String>,List<String>> = list.partition { it.length > 5 }
    val (listmatch, listNotMatch) = list.partition { it.length > 5 }

    println(listmatch)
    println(listNotMatch)
}