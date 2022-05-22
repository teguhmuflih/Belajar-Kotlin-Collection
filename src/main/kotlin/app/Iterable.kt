package app

fun <T> displayIterable(iterable: Iterable<T>){
//    cara otomatis
//    for (value in iterable){
//        println(value)
//    }
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Teguh","Muflih","Rizky"))
    displayIterable(setOf("Teguh","Muflih","Rizky"))
}