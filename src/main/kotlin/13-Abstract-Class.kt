fun main() {
    val book = BookRepoIml()
    println(book.table)
    book.selectBookByID()
    book.saveBook()
}

abstract class BookRepo {
    var table = "Book"
    abstract fun selectBookByID()

    fun saveBook() {
    }
}

class BookRepoIml: BookRepo() {
    override fun selectBookByID() {
        println("book = Kotlin Programming")
    }

}


