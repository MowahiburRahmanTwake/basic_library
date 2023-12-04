class Book(val title: String, val author: String, val publicationYear: Int, var isBorrowed: Boolean = false)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun displayBooks() {
        var isAvailable:Boolean = false
        for (book in books) {
            if (!book.isBorrowed) {
                println("${book.title} by ${book.author} (${book.publicationYear})")
                isAvailable = true
                break
            }
        }
        if (!isAvailable){
            println("Not Available book")
        }
    }
