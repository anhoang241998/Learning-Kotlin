fun main() {
    var book1 = Book("Kotlin Programming", "Ryan", "2020")
    var book2 = Book("Kotlin Programming", "Ryan", "2020")
    var book3 = book1.copy(date = "2021")

    println(book1 == book2)
    println(book1.toString())
    println(book3)


    var baby1 = Baby("A", 1)
    var baby2 = Baby("A", 1)

    println(baby1 == baby2)
    println(baby1.toString())
}

data class Book(val title: String, val author: String, val date: String){
    fun copy(title: String = this.title, author: String = this.author) = Book(title, author, date)
}

class Baby(val name: String, val age: Int)