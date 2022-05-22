package app

fun <T> displayCollections(collection : Collection<T>){
    for (element in collection){
        println(element)
    }
}
fun main() {
    displayCollections(listOf("Teguh", "Muflih"))
    displayCollections(setOf("Teguh", "Muflih"))
    displayCollections(mapOf("Teguh" to  "Muflih").entries)
//    displayCollections(mapOf("Teguh", "Muflih")) // error karena mapof bukan bagian dari collections
}