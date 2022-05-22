package app

fun main() {
    val list: List<String> = listOf("Teguh", "Muflih", "Rizky")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Rizky"))
    println(list.indexOf("tidak ada"))
    println(list.contains("Teguh"))
    println(list.contains("Tidak ada"))
    println(list.containsAll(listOf("Teguh", "Rizky")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}