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
<<<<<<< HEAD
        if (!isAvailable){
            println("Not Available book")
        }
    }
=======
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
>>>>>>> ffecc58f40e03892ece0ba52acbcd100a2067d88
