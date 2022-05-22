package app

fun main() {
    val mutableMap : MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Teguh")
    mutableMap["b"] = "Muflih"
    mutableMap["c"] = "Rizky"

    println(mutableMap["a"])
    println(mutableMap.get("a"))
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.get("d"))
    println(mutableMap.getOrDefault("d","Tidak ada"))
    println(mutableMap.getOrDefault("a","Tidak ada"))
}