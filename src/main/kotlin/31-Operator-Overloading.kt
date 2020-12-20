fun main() {
    var man = PurePerson("Ryan")
    val woman = PurePerson("Emily")
    val result = man + woman
    println(result)

    println(man.name)
    man++
    println(man.name)
}

data class PurePerson(
        val name: String
) {
    operator fun plus(purePerson: PurePerson) = "BaBy"
    operator fun inc() = PurePerson("INC")
}

