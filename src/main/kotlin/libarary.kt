class Book(val title: String, val author: String, val publicationYear: Int) {
    var isBorrowed: Boolean = false

}

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun displayBooks() {
        if (books.isEmpty()) {
            println("The library is empty.")
        } else {
            println("Books in the library:")
            for (book in books) {
                if (!book.isBorrowed) {
                    println("Book Name: ${book.title} Author: ${book.author} Published Year: ${book.publicationYear}")
                }
            }
        }
    }

// Binthia parveen Biva

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