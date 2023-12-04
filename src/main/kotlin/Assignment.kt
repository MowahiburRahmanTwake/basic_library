//Md. Sharifullah Patwary
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