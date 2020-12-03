fun main() {
    var environment = Env.PRODUCTION
    println(environment)
    println(environment.toString())
    println(environment.ordinal)
    println(environment.name)

    println("=====")
    for (item in Env.values()) {
        println("$item - value = ${item.value}")
        println("$item - value = ${item.transform()}")
    }
}

enum class Env(val value: Int) {
    PRODUCTION(100) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }

        override fun toString(): String {
            return "abc"
        }

    },

    STAGING(200) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }
    },
    DEVELOPMENT(300) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }
    };

    abstract fun transform(): String
}