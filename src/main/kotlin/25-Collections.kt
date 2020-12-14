fun main() {
//  Collections: List, set, map (Mutable, immutable)
    val list = listOf(1, 2, 3, 4) // listOf la immutable
    println(list)

    println("=====")
    var list2 = list.map {
        it * 2
    }.filter {
        it / 2 == 1
    }
    println(list2)
    println("=====")

    var list1 = mutableListOf(1)
    list1.add(2)
    list1.add(3)
    list1.add(4)
    list1.add(5)
    println(list1)

    val set = setOf(1, 2, 2, 2 ,3 ,4)
    println(set)

    val map = mutableMapOf(
            "key0" to 0,
            "key1" to 1,
            "key2" to 2
    )
    println(map)

    println("======")
    var filterMap = map.filterKeys {
        it == "key0"
    }
    println(filterMap)

    // map, filter, flatmap

}

