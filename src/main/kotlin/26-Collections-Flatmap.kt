fun main() {

    val groceryBags = listOf(
            ShoppingBag(listOf(
                    "Grapes",
                    "Apples",
                    "Oranges"
            )),
            ShoppingBag(listOf(
                    "Milk",
                    "Eggs",
                    "Pasta"
            )),
            ShoppingBag(listOf(
                    "Bread",
                    "Naan",
                    "Cake"
            )),
    )

    val retail = listOf(
            ShoppingBag(listOf(
                    "Shirts",
                    "Pants",
                    "Trousers"
            )),
            ShoppingBag(listOf(
                    "Socks",
                    "Shoes"
            )),
            ShoppingBag(listOf(
                    "Jacket",
                    "Sweater",
                    "Scarf"
            )),
    )

    val groceries = groceryBags.flatMap {
        it.items
    }
    println(groceries)

    val clothes = retail.map {
        it.items
    }
    println(clothes)

}

class ShoppingBag(val items: List<String>)


