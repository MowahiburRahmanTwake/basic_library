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

    fun searchByAuthor(author: String) {
        var isAvailable:Boolean = false
        for (book in books) {
            if (!book.isBorrowed && book.author == author) {
                println("${book.title} by ${book.author} (${book.publicationYear})")
                isAvailable = true
                break
            }
        }
        if (!isAvailable) {
            println("Not Available book")
        }

    }

    fun searchByYear(year: Int) {
        var isAvailable:Boolean = false
        for (book in books) {
            if (!book.isBorrowed && book.publicationYear == year) {
                println("${book.title} by ${book.author} (${book.publicationYear})")
                isAvailable = true
                break
            }

        }
        if (!isAvailable) {
            println("Not Available book")
        }
    }

    fun borrowBook(title: String) {
        for (book in books) {
            if (!book.isBorrowed && book.title == title) {
                book.isBorrowed = true
                println("You have successfully borrowed ${book.title}.")
                return
            }
        }
        println("Book not found or already borrowed.")
    }

    fun returnBook(title: String) {
        for (book in books) {
            if (book.title == title && book.isBorrowed) {
                book.isBorrowed = false
                println("You have successfully returned ${book.title}.")
                return
            }
        }
        println("Book not found or not borrowed.")
    }
}