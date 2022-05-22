package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Teguh"), Person("Muflih"), Person("Rizky"), Person("Teguh"),
    )

    println(set.size)
    println(set.contains(Person("Teguh")))

    for (person in set){
        println(person)
    }
}