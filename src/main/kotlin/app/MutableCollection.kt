package app

fun<T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}
fun main() {
//    displayMutableCollection(listOf("Teguh", "Muflih")) //error
    displayMutableCollection(mutableListOf("Teguh", "Muflih"))
//    displayMutableCollection(setOf("Teguh", "Muflih")) // error
    displayMutableCollection(mutableSetOf("Teguh", "Muflih"))
//    displayMutableCollection(mapOf("Teguh" to  "Muflih").entries) //error
    displayMutableCollection(mutableMapOf("Teguh" to  "Muflih").entries)
//    displayCollections(mapOf("Teguh", "Muflih")) // error karena mapof bukan bagian dari collections

}