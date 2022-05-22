package app

fun main() {
    val mutableList : MutableList<String> = mutableListOf()

    mutableList.add("Teguh")
    mutableList.add("Muflih")
    mutableList.add("Rizky")

//    mutableList[0] = "Eko"
//    mutableList.remove("Eko")

    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])

    for (value in mutableList){
        println(value)
    }
}