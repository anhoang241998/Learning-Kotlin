fun main() {
//    val email: String = "ryan@gmail.com"
    val email: Email = "ryan@gmail.com"
    val node: Node = setOf("asdasd", "adad")
    val nodeKey: NodeKey = mapOf()
}

fun handler(data: Int, handler: (Int) -> Unit) {
    handler(data)
}

fun handler1(data: Int, handler: Handler) {
    handler(data)
}


typealias Email = String
typealias Node = Set<String>
typealias NodeKey = Map<String, Int>
typealias Handler = (Int) -> Unit

