package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>){
//    cara otomatis
//    for (value in iterable){
//        println(value)
//    }
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
//        iterator.remove // menghapus data dari iterasi -> hanya ada di mutableIterator
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Teguh","Muflih","Rizky"))
    displayMutableIterable(mutableSetOf("Teguh","Muflih","Rizky"))
}