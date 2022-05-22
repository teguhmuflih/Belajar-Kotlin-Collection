package app

import data.Person

fun main() {
    val mutableSet : MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Teguh"))
    mutableSet.add(Person("Muflih"))
    mutableSet.add(Person("Rizky"))
    mutableSet.add(Person("Unang"))
    mutableSet.add(Person("Teguh"))

    println(mutableSet)
    for (person in mutableSet){
        println(person)
    }
}